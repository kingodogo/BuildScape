package com.kingodogo.buildscape.api.model;

import java.util.List;
import java.util.Map;

/**
 * Response model for authentication endpoint.
 * Contains cosmetic data and error information.
 */
public class AuthenticateResponse {
    private String error;
    private String code;

    // Cosmetic data fields
    private List<String> defaultCosmetics;
    private List<String> unlockedCosmetics;
    private Map<String, String> selectedCosmetics;

    public AuthenticateResponse() {
    }

    /**
     * Check if this response contains an error.
     */
    public boolean isError() {
        return error != null && !error.isEmpty();
    }

    /**
     * Convert this response to CosmeticData.
     */
    public CosmeticData toCosmeticData() {
        CosmeticData data = new CosmeticData();
        data.setDefaultCosmetics(defaultCosmetics);
        data.setUnlockedCosmetics(unlockedCosmetics);
        data.setSelectedCosmetics(selectedCosmetics);
        data.adaptFromSecureResponse();
        return data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getDefaultCosmetics() {
        return defaultCosmetics;
    }

    public void setDefaultCosmetics(List<String> defaultCosmetics) {
        this.defaultCosmetics = defaultCosmetics;
    }

    public List<String> getUnlockedCosmetics() {
        return unlockedCosmetics;
    }

    public void setUnlockedCosmetics(List<String> unlockedCosmetics) {
        this.unlockedCosmetics = unlockedCosmetics;
    }

    public Map<String, String> getSelectedCosmetics() {
        return selectedCosmetics;
    }

    public void setSelectedCosmetics(Map<String, String> selectedCosmetics) {
        this.selectedCosmetics = selectedCosmetics;
    }
}