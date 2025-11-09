package sivathoc.points.model;

import java.util.List;

public class PointsQuoteResponse {
    private int basePoints;
    private int tierBonusPoints;
    private int promoBonusPoints;
    private int totalPoints;
    private double effectivePointsRate;
    private List<WarningCode> warnings;

    // Builder pattern for immutability for constructing PointsQuoteResponse
    public static class Builder {
        private final PointsQuoteResponse response = new PointsQuoteResponse();
        
        public Builder basePoints(int basePoints) {
            response.basePoints = basePoints;
            return this;
        }
        public Builder tierBonusPoints(int tierBonusPoints) {
            response.tierBonusPoints = tierBonusPoints;
            return this;
        }
        public Builder promoBonusPoints(int promoBonusPoints) {
            response.promoBonusPoints = promoBonusPoints;
            return this;
        }
        public Builder totalPoints(int totalPoints) {
            response.totalPoints = totalPoints;
            return this;
        }
        public Builder effectivePointsRate(double effectivePointsRate) {
            response.effectivePointsRate = effectivePointsRate;
            return this;
        }
        public Builder warnings(List<WarningCode> warnings) {
            response.warnings = warnings;
            return this;
        }
        public PointsQuoteResponse build() {
            return response;
        }
    }
    //Getter
    public int getBasePoints(){ return basePoints; }
    public int getTierBonusPoints() { return tierBonusPoints; }
    public int getPromoBonusPoints () {  return promoBonusPoints; }
    public int getTotalPoints() { return totalPoints; }
    public double getEffectivePointRate() { return effectivePointsRate;}
    public List<WarningCode> getWarningCode() { return warnings; }
}
