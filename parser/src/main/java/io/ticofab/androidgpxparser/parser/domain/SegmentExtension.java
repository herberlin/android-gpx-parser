package io.ticofab.androidgpxparser.parser.domain;

import org.joda.time.DateTime;

public class SegmentExtension {

    private SegmentExtension(SegmentExtension.Builder builder) {
        this.builder = builder;
    }

    private Builder builder;
    public DateTime getStartTime() {
        return builder.startTime;
    }
    public DateTime getEndTime() {
        return builder.endTime;
    }

    public static class Builder {
        private DateTime startTime;
        private DateTime endTime;

        public SegmentExtension.Builder setStartTime(DateTime t) {
            this.startTime = t;
            return this;
        }
        public SegmentExtension.Builder setEndTime(DateTime t) {
            this.endTime = t;
            return this;
        }

        public SegmentExtension build() {
            return new SegmentExtension(this);
        }
    }
}
