package com.bitdottech.Shield.Interface;

import java.util.List;

public interface IOnLocationListener {
    void onLoadLocationSuccess(List<MyLatLng> latLngs);
    void onLoadLocationFailed(String message);

}
