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

/**
 * Syntactic dependency
 */
@JacksonMixin
public final class Dependency {
    /**
     */
    private final String dependencyType;
    /**
     */
    private final Integer governorTokenIndex;
    /**
     */
    private final Integer dependentTokenIndex;

    @java.beans.ConstructorProperties({"dependencyType", "governorTokenIndex", "dependentTokenIndex"})
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    Dependency(final String dependencyType, final Integer governorTokenIndex, final Integer dependentTokenIndex) {
        this.dependencyType = dependencyType;
        this.governorTokenIndex = governorTokenIndex;
        this.dependentTokenIndex = dependentTokenIndex;
    }


    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static class DependencyBuilder {
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private String dependencyType;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private Integer governorTokenIndex;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private Integer dependentTokenIndex;

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        DependencyBuilder() {
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public DependencyBuilder dependencyType(final String dependencyType) {
            this.dependencyType = dependencyType;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public DependencyBuilder governorTokenIndex(final Integer governorTokenIndex) {
            this.governorTokenIndex = governorTokenIndex;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public DependencyBuilder dependentTokenIndex(final Integer dependentTokenIndex) {
            this.dependentTokenIndex = dependentTokenIndex;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public Dependency build() {
            return new Dependency(dependencyType, governorTokenIndex, dependentTokenIndex);
        }

        @Override
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public String toString() {
            return "Dependency.DependencyBuilder(dependencyType=" + this.dependencyType + ", governorTokenIndex=" + this.governorTokenIndex + ", dependentTokenIndex=" + this.dependentTokenIndex + ")";
        }
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static DependencyBuilder builder() {
        return new DependencyBuilder();
    }

    /**
     * @return the dependency type
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public String getDependencyType() {
        return this.dependencyType;
    }

    /**
     * @return the governor token index
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Integer getGovernorTokenIndex() {
        return this.governorTokenIndex;
    }

    /**
     * @return the dependent token index
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Integer getDependentTokenIndex() {
        return this.dependentTokenIndex;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Dependency)) return false;
        final Dependency other = (Dependency) o;
        final Object this$dependencyType = this.getDependencyType();
        final Object other$dependencyType = other.getDependencyType();
        if (this$dependencyType == null ? other$dependencyType != null : !this$dependencyType.equals(other$dependencyType)) return false;
        final Object this$governorTokenIndex = this.getGovernorTokenIndex();
        final Object other$governorTokenIndex = other.getGovernorTokenIndex();
        if (this$governorTokenIndex == null ? other$governorTokenIndex != null : !this$governorTokenIndex.equals(other$governorTokenIndex)) return false;
        final Object this$dependentTokenIndex = this.getDependentTokenIndex();
        final Object other$dependentTokenIndex = other.getDependentTokenIndex();
        if (this$dependentTokenIndex == null ? other$dependentTokenIndex != null : !this$dependentTokenIndex.equals(other$dependentTokenIndex)) return false;
        return true;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $dependencyType = this.getDependencyType();
        result = result * PRIME + ($dependencyType == null ? 43 : $dependencyType.hashCode());
        final Object $governorTokenIndex = this.getGovernorTokenIndex();
        result = result * PRIME + ($governorTokenIndex == null ? 43 : $governorTokenIndex.hashCode());
        final Object $dependentTokenIndex = this.getDependentTokenIndex();
        result = result * PRIME + ($dependentTokenIndex == null ? 43 : $dependentTokenIndex.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public String toString() {
        return "Dependency(dependencyType=" + this.getDependencyType() + ", governorTokenIndex=" + this.getGovernorTokenIndex() + ", dependentTokenIndex=" + this.getDependentTokenIndex() + ")";
    }
}