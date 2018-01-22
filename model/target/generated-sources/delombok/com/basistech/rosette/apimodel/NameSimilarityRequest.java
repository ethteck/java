// Generated by delombok at Mon Jan 22 15:21:35 EST 2018
/*
* Copyright 2017 Basis Technology Corp.
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
package com.basistech.rosette.apimodel;

import javax.validation.constraints.NotNull;

/**
 * Request object for name-similarity.
 *
 * This class carries the two names to compare.
 */
public final class NameSimilarityRequest extends Request {
    /**
     */
    @NotNull
    private final Name name1;
    /**
     */
    @NotNull
    private final Name name2;

    // workaround for inheritance https://github.com/rzwitserloot/lombok/issues/853
    public NameSimilarityRequest(String profileId, Name name1, Name name2) {
        super(profileId);
        this.name1 = name1;
        this.name2 = name2;
    }


    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static class NameSimilarityRequestBuilder {
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private String profileId;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private Name name1;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private Name name2;

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        NameSimilarityRequestBuilder() {
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public NameSimilarityRequestBuilder profileId(final String profileId) {
            this.profileId = profileId;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public NameSimilarityRequestBuilder name1(final Name name1) {
            this.name1 = name1;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public NameSimilarityRequestBuilder name2(final Name name2) {
            this.name2 = name2;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public NameSimilarityRequest build() {
            return new NameSimilarityRequest(profileId, name1, name2);
        }

        @Override
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public String toString() {
            return "NameSimilarityRequest.NameSimilarityRequestBuilder(profileId=" + this.profileId + ", name1=" + this.name1 + ", name2=" + this.name2 + ")";
        }
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static NameSimilarityRequestBuilder builder() {
        return new NameSimilarityRequestBuilder();
    }

    /**
     * @return first name
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Name getName1() {
        return this.name1;
    }

    /**
     * @return second name
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Name getName2() {
        return this.name2;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof NameSimilarityRequest)) return false;
        final NameSimilarityRequest other = (NameSimilarityRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$name1 = this.getName1();
        final Object other$name1 = other.getName1();
        if (this$name1 == null ? other$name1 != null : !this$name1.equals(other$name1)) return false;
        final Object this$name2 = this.getName2();
        final Object other$name2 = other.getName2();
        if (this$name2 == null ? other$name2 != null : !this$name2.equals(other$name2)) return false;
        return true;
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final Object other) {
        return other instanceof NameSimilarityRequest;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + super.hashCode();
        final Object $name1 = this.getName1();
        result = result * PRIME + ($name1 == null ? 43 : $name1.hashCode());
        final Object $name2 = this.getName2();
        result = result * PRIME + ($name2 == null ? 43 : $name2.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public String toString() {
        return "NameSimilarityRequest(name1=" + this.getName1() + ", name2=" + this.getName2() + ")";
    }
}