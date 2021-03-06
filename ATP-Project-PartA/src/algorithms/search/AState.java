package algorithms.search;

import algorithms.mazeGenerators.Position;

public abstract class AState implements java.io.Serializable{

    private String key;
    private AState cameFrom;
    private int cost;
    private int priorityCounter = 0;
    private boolean inOpenList; // true when the state is in openList.
    private boolean inCloseList; // true when the state is in closeList.

    public AState(String name, AState cameFrom, int cost) {
        this.key = name;
        this.cameFrom = cameFrom;
        this.cost = cost;
    }

    public boolean isInOpenList() {
        return inOpenList;
    }
    public boolean isInCloseList() {
        return inCloseList;
    }

    public void setInOpenList(boolean inOpenList) {
        this.inOpenList = inOpenList;
    }
    public void setInCloseList(boolean inCloseList) {
        this.inCloseList = inCloseList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AState aState = (AState) o;
        return getKey().equals(aState.getKey()) ;
    }
    /*
        @Override
        public int hashCode() {
            return Objects.hash(key, cameFrom, cost);
        }
    */
    public String getKey() {
        return key;
    }

    public AState getCameFrom() {
        return cameFrom;
    }

    public int getCost() {
        return cost;
    }

    public void setCameFrom(AState cameFrom) {
        this.cameFrom = cameFrom;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPriorityCounter() {
        return priorityCounter;
    }

    public void setPriorityCounter(int priorityCounter) {
        this.priorityCounter = priorityCounter;
    }

    @Override
    public String toString() {
        String[] arrS= getKey().split("\\$");
        String finalKey ="{";
        for (int i=0; i<arrS.length-1;i++){
            finalKey += arrS[i]+",";
        }
        finalKey += arrS[arrS.length-1]+"}";
        return finalKey;
    }
}

