package interfaces;

public interface Repairable {

    boolean isInRepair();
    void setInRepair(boolean inRepair);
    void setMinimumRepairCost(float cost);
    float getMinimumRepairCost();
}