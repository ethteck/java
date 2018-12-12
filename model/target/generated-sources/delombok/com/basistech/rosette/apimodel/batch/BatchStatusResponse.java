// Generated by delombok at Mon Jan 22 15:21:35 EST 2018
/*
* Copyright 2016 Basis Technology Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.basistech.rosette.apimodel.batch;

import com.basistech.rosette.annotations.JacksonMixin;
import com.basistech.rosette.apimodel.Response;

@JacksonMixin
public final class BatchStatusResponse extends Response {
    // batch batchId
    private final String batchId;
    // whether the job is in progress
    private final float progress;

    @java.beans.ConstructorProperties({"batchId", "progress"})
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    BatchStatusResponse(final String batchId, final float progress) {
        this.batchId = batchId;
        this.progress = progress;
    }


    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static class BatchStatusResponseBuilder {
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private String batchId;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private float progress;

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        BatchStatusResponseBuilder() {
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public BatchStatusResponseBuilder batchId(final String batchId) {
            this.batchId = batchId;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public BatchStatusResponseBuilder progress(final float progress) {
            this.progress = progress;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public BatchStatusResponse build() {
            return new BatchStatusResponse(batchId, progress);
        }

        @Override
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public String toString() {
            return "BatchStatusResponse.BatchStatusResponseBuilder(batchId=" + this.batchId + ", progress=" + this.progress + ")";
        }
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static BatchStatusResponseBuilder builder() {
        return new BatchStatusResponseBuilder();
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public String getBatchId() {
        return this.batchId;
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public float getProgress() {
        return this.progress;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BatchStatusResponse)) return false;
        final BatchStatusResponse other = (BatchStatusResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$batchId = this.getBatchId();
        final Object other$batchId = other.getBatchId();
        if (this$batchId == null ? other$batchId != null : !this$batchId.equals(other$batchId)) return false;
        if (Float.compare(this.getProgress(), other.getProgress()) != 0) return false;
        return true;
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final Object other) {
        return other instanceof BatchStatusResponse;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + super.hashCode();
        final Object $batchId = this.getBatchId();
        result = result * PRIME + ($batchId == null ? 43 : $batchId.hashCode());
        result = result * PRIME + Float.floatToIntBits(this.getProgress());
        return result;
    }
}