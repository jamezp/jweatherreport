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
 *
 * You should have received a copy of the GNU General Public License
 * along with jweatherreport; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.chowhouse.jweatherreport.station;

import java.math.BigDecimal;

public class Loop {

	private BarometerTrend barometerTrend;
	private BigDecimal barometricPressure;
	private BigDecimal dayRain;
	private int insideHumidity;
	private BigDecimal insideTemperature;
	private BigDecimal monthRain;
	private int outsideHumidity;
	private BigDecimal outsideTemperature;
	private BigDecimal rainRate;
	private BigDecimal stormRain;
	private int tenMinuteAverageWindSpeed;
	private int windDirection;
	private int windSpeed;
	private BigDecimal yearRain;

	public BarometerTrend getBarometerTrend() {
		return barometerTrend;
	}

	protected void setBarometerTrend(BarometerTrend barometerTrend) {
		this.barometerTrend = barometerTrend;
	}

	protected void setBarometerTrend(int trend) {
		barometerTrend = BarometerTrend.validateType(trend);
	}

	public BigDecimal getBarometricPressure() {
		return barometricPressure;
	}

	protected void setBarometricPressure(BigDecimal barometricPressure) {
		this.barometricPressure = barometricPressure;
	}

	protected void setBarometricPressure(byte one, byte two) {
		int bar = Utils.setInteger(one, two);
		barometricPressure = new BigDecimal(bar);
		barometricPressure = barometricPressure.movePointLeft(3);
	}

	public BigDecimal getDayRain() {
		return dayRain;
	}

	protected void setDayRain(BigDecimal dayRain) {
		this.dayRain = dayRain;
	}

	protected void setDayRain(byte one, byte two) {
		int rain = Utils.setInteger(one, two);
		dayRain = new BigDecimal(rain);
		dayRain = dayRain.movePointLeft(2);
	}

	public int getInsideHumidity() {
		return insideHumidity;
	}

	protected void setInsideHumidity(int insideHumidity) {
		this.insideHumidity = insideHumidity;
	}

	public BigDecimal getInsideTemperature() {
		return insideTemperature;
	}

	protected void setInsideTemperature(BigDecimal insideTemperature) {
		this.insideTemperature = insideTemperature;
	}

	protected void setInsideTemperature(byte one, byte two) {
		int temp = Utils.setInteger(one, two);
		insideTemperature = new BigDecimal(temp);
		insideTemperature = insideTemperature.movePointLeft(1);
	}

	public BigDecimal getMonthRain() {
		return monthRain;
	}

	protected void setMonthRain(BigDecimal monthRain) {
		this.monthRain = monthRain;
	}

	protected void setMonthRain(byte one, byte two) {
		int rain = Utils.setInteger(one, two);
		monthRain = new BigDecimal(rain);
		monthRain = monthRain.movePointLeft(2);
	}

	public int getOutsideHumidity() {
		return outsideHumidity;
	}

	protected void setOutsideHumidity(int outsideHumidity) {
		this.outsideHumidity = outsideHumidity;
	}

	public BigDecimal getOutsideTemperature() {
		return outsideTemperature;
	}

	protected void setOutsideTemperature(BigDecimal outsideTemperature) {
		this.outsideTemperature = outsideTemperature;
	}

	protected void setOutsideTemperature(byte one, byte two) {
		int temp = Utils.setInteger(one, two);
		outsideTemperature = new BigDecimal(temp);
		outsideTemperature = outsideTemperature.movePointLeft(1);
	}

	public BigDecimal getRainRate() {
		return rainRate;
	}

	protected void setRainRate(BigDecimal rainRate) {
		this.rainRate = rainRate;
	}

	protected void setRainRate(byte one, byte two) {
		int temp = Utils.setInteger(one, two);
		rainRate = new BigDecimal(temp);
		rainRate = rainRate.movePointLeft(2);
	}

	public BigDecimal getStormRain() {
		return stormRain;
	}

	protected void setStormRain(BigDecimal stormRain) {
		this.stormRain = stormRain;
	}

	protected void setStormRain(byte one, byte two) {
		int temp = Utils.setInteger(one, two);
		stormRain = new BigDecimal(temp);
		stormRain = stormRain.movePointLeft(2);
	}

	public int getTenMinuteAverageWindSpeed() {
		return tenMinuteAverageWindSpeed;
	}

	protected void setTenMinuteAverageWindSpeed(int tenMinuteAverageWindSpeed) {
		this.tenMinuteAverageWindSpeed = tenMinuteAverageWindSpeed;
	}

	public int getWindDirection() {
		return windDirection;
	}

	protected void setWindDirection(int windDirection) {
		this.windDirection = windDirection;
	}

	protected void setWindDirection(byte one, byte two) {
		windDirection = Utils.setInteger(one, two);
	}

	public int getWindSpeed() {
		return windSpeed;
	}

	protected void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}

	public BigDecimal getYearRain() {
		return yearRain;
	}

	protected void setYearRain(BigDecimal yearRain) {
		this.yearRain = yearRain;
	}

	protected void setYearRain(byte one, byte two) {
		int rain = Utils.setInteger(one, two);
		yearRain = new BigDecimal(rain);
		yearRain = yearRain.movePointLeft(2);
	}
}
