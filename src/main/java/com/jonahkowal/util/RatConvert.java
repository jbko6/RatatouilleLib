package com.jonahkowal.util;

import com.jonahkowal.RatatouilleInfo;

/*
 * This class provides unit conversions between imperial, metric, and ratatouille units
 * 
 */
public class RatConvert {
    private enum ConversionConstants {
        ratatouilleToHour(2),
        ratatouilleToMinute(120),
        ratatouilleToSecond(7200),
        remyToInch(6),
        remyToFeet(0.5),
        remyToYard(1/(3*2)), // one yard is 3 feet, 3 feet is 6 remys, then divide by 1 
        remyToMile(1/(5280*2)), 
        remyToMeter(1/(3.2808*2));

        double ratio;

        ConversionConstants(double ratio) {
            this.ratio = ratio;
        }
    }

    public static double ratatouilleToHour(double ratatouille) {
        return ratatouille * ConversionConstants.ratatouilleToHour.ratio;
    }

    public static double hourToRatatouille(double hour) {
        return hour / ConversionConstants.ratatouilleToHour.ratio;
    }

    public static double ratatouilleToMinute(double ratatouilles) {
        return ratatouilles * ConversionConstants.ratatouilleToMinute.ratio;
    }

    public static double minutesToRatatouille(double minutes) {
        return minutes / ConversionConstants.ratatouilleToMinute.ratio;
    }

    public static double ratatouilleToSecond(double ratatouille) {
        return ratatouille * ConversionConstants.ratatouilleToSecond.ratio;
    }

    public static double secondToRatatouille(double second) {
        return second / ConversionConstants.ratatouilleToSecond.ratio;
    }

    public static double remyToInch(double remy) {
        return remy * ConversionConstants.remyToInch.ratio;
    }

    public static double inchesToRemy(double inches) {
        return inches / ConversionConstants.remyToInch.ratio;
    }

    public static double remyToFeet(double remy) {
        return remy * ConversionConstants.remyToFeet.ratio;
    }

    public static double feetToRemy(double feet) {
        return feet / ConversionConstants.remyToFeet.ratio;
    }

    public static double remyToYard(double remy) {
        return remy * ConversionConstants.remyToYard.ratio;
    }

    public static double yardToRemy(double yard) {
        return yard / ConversionConstants.remyToYard.ratio;
    }

    public static double remyToMile(double remy) {
        return remy * ConversionConstants.remyToMile.ratio;
    }

    public static double mileToRemy(double mile) {
        return mile / ConversionConstants.remyToMile.ratio;
    }

    public static double remyToMeter(double remy) {
        return remy * ConversionConstants.remyToMeter.ratio;
    }

    public static double meterToRemy(double meter) {
        return meter / ConversionConstants.remyToMeter.ratio;
    }
}
