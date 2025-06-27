package io.ticofab.androidgpxparser.parser.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrackSegment {
    private final List<TrackPoint> mTrackPoints;
    private final SegmentExtension mSegmentExtension;

    private TrackSegment(Builder builder) {
        mTrackPoints = Collections.unmodifiableList(new ArrayList<>(builder.mTrackPoints));
        mSegmentExtension = builder.mSegmentExtension;
    }

    public List<TrackPoint> getTrackPoints() {
        return mTrackPoints;
    }
    public SegmentExtension getSegmentExtension() {return mSegmentExtension;}

    public static class Builder {
        private List<TrackPoint> mTrackPoints;
        private SegmentExtension mSegmentExtension;

        public Builder setTrackPoints(List<TrackPoint> trackPoints) {
            mTrackPoints = trackPoints;
            return this;
        }

        public TrackSegment build() {
            return new TrackSegment(this);
        }

        public Builder setSegmentExtension(SegmentExtension segmentExtension) {
            mSegmentExtension = segmentExtension;
            return this;
        }
    }
}
