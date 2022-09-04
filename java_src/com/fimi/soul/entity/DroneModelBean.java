package com.fimi.soul.entity;

import com.fimi.soul.drone.C2083a;
import java.util.Observable;
/* loaded from: classes.dex */
public class DroneModelBean extends Observable {
    private int ctrlType;
    private int currentFlightModel;
    private C2083a drone;
    private int flightModel;

    public DroneModelBean(C2083a c2083a) {
        this.drone = c2083a;
    }

    public int getCurrentFlightModel() {
        return this.currentFlightModel;
    }

    public int getFlightModel() {
        return this.flightModel;
    }

    public void setFlightModel(int i, int i2) {
        this.currentFlightModel = this.flightModel;
        this.ctrlType = i2;
        if ((this.flightModel == 7 || this.flightModel == 3) && ((i2 == 2 || i2 == 1) && i == 1 && !this.drone.m33009am())) {
            setChanged();
            notifyObservers();
        }
        if (this.flightModel == 2 && this.drone.m33009am() && i == 1) {
            setChanged();
            notifyObservers();
        }
        this.flightModel = i;
    }
}
