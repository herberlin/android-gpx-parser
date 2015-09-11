package io.ticofab.androidgpxparser.parser.domain;

import java.util.List;

public class TrackSegment {
    private final List<TrackPoint> mTrackPoints;

    public TrackSegment(Builder builder) {
        mTrackPoints = builder.mTrackPoints;
    }

    public List<TrackPoint> getTrackPoints() {
        return mTrackPoints;
    }

    public static class Builder {
        private List<TrackPoint> mTrackPoints;

        public Builder setTrackPoints(List<TrackPoint> trackPoints) {
            mTrackPoints = trackPoints;
            return this;
        }

        public TrackSegment build() {
            return new TrackSegment(this);
        }
    }
}