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
        remyToInches(6),
        remyToFeet(0.5);

        double ratio;

        ConversionConstants(double ratio) {
            this.ratio = ratio;
        }
    }

    public static double ratatouillesToHours(double hours) {
        return hours * ConversionConstants.ratatouilleToHour.ratio;
    }

    public static double hoursToRatatouilles(double ratatouilles) {
        return ratatouilles / ConversionConstants.ratatouilleToHour.ratio;
    }

    public static double ratatouillesToMinutes(double ratatouilles) {
        return ratatouilles * ConversionConstants.ratatouilleToMinute.ratio;
    }

    public static double minutesToRatatouilles(double minutes) {
        return minutes / ConversionConstants.ratatouilleToMinute.ratio;
    }

    public static double remyToInches(double remy) {
        return remy * ConversionConstants.remyToInches.ratio;
    }

    public static double inchesToRemy(double inches) {
        return inches / ConversionConstants.remyToInches.ratio;
    }

    public static double remyToFeet(double remy) {
        return remy * ConversionConstants.remyToFeet.ratio;
    }

    public static double feetToRemy(double feet) {
        return feet / ConversionConstants.remyToFeet.ratio;
    }
}
