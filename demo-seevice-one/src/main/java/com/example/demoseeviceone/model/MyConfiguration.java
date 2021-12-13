package com.example.demoseeviceone.model;

public class MyConfiguration {
    private long min;
    private long max;

    public MyConfiguration() {
    }

    public MyConfiguration(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }
}
