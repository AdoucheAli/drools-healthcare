package com.michaelpellegrini.drools.healthcare.fact.type;

import com.michaelpellegrini.drools.healthcare.fact.value.BMIDiseaseRiskConstraint;

import java.util.Objects;

public final class BMIDiseaseRisk {
	
	private final BMIDiseaseRiskConstraint value;
	
	public BMIDiseaseRisk(BMIDiseaseRiskConstraint value) {
		this.value = value;
	}
	
	public BMIDiseaseRiskConstraint getValue() {
		return value;
	}

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName())
                .append("@")
                .append(Integer.toHexString(System.identityHashCode(this)))
                .append("{")
                .append("value=").append(value)
                .append("}").toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final BMIDiseaseRisk that = (BMIDiseaseRisk) obj;

        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}


