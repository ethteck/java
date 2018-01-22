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

import com.basistech.rosette.annotations.JacksonMixin;
import java.util.Collection;

/**
 * Information returned from the sentiment endpoint.
 */
@JacksonMixin
public class SentimentResponse extends Response {
    /**
     */
    private final Label document;
    /**
     */
    private final Collection<Entity> entities;

    @java.beans.ConstructorProperties({"document", "entities"})
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    SentimentResponse(final Label document, final Collection<Entity> entities) {
        this.document = document;
        this.entities = entities;
    }


    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static class SentimentResponseBuilder {
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private Label document;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private Collection<Entity> entities;

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        SentimentResponseBuilder() {
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public SentimentResponseBuilder document(final Label document) {
            this.document = document;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public SentimentResponseBuilder entities(final Collection<Entity> entities) {
            this.entities = entities;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public SentimentResponse build() {
            return new SentimentResponse(document, entities);
        }

        @Override
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public String toString() {
            return "SentimentResponse.SentimentResponseBuilder(document=" + this.document + ", entities=" + this.entities + ")";
        }
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static SentimentResponseBuilder builder() {
        return new SentimentResponseBuilder();
    }

    /**
     * @return the whole-document sentiment.
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Label getDocument() {
        return this.document;
    }

    /**
     * @return the information for individual entities.
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Collection<Entity> getEntities() {
        return this.entities;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SentimentResponse)) return false;
        final SentimentResponse other = (SentimentResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$document = this.getDocument();
        final Object other$document = other.getDocument();
        if (this$document == null ? other$document != null : !this$document.equals(other$document)) return false;
        final Object this$entities = this.getEntities();
        final Object other$entities = other.getEntities();
        if (this$entities == null ? other$entities != null : !this$entities.equals(other$entities)) return false;
        return true;
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final Object other) {
        return other instanceof SentimentResponse;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + super.hashCode();
        final Object $document = this.getDocument();
        result = result * PRIME + ($document == null ? 43 : $document.hashCode());
        final Object $entities = this.getEntities();
        result = result * PRIME + ($entities == null ? 43 : $entities.hashCode());
        return result;
    }
}