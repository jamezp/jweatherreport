/*
 * Copyright 2016 James Rich
 *
 * jweatherreport is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * jweatherreport is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with jweatherreport; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.chowhouse.jweatherreport.station;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
public class SimpleCommand extends AbstractCommand<String> {

	private final byte[] expected;

	public SimpleCommand(final String command, final String description) {
		this(command, description, OK);
	}

	public SimpleCommand(final String command, final String description,
			final String expectedResponse) {
		this(command, description, expectedResponse.getBytes());
	}

	public SimpleCommand(final String command, final String description,
			final byte[] expectedResponse) {
		super(command, description);
		this.expected = Arrays.copyOf(expectedResponse, expectedResponse.length);
	}

	@Override
	public String execute(final InputStream in)
	throws IOException {
		return readResponse(in, expected);
	}
}
