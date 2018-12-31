package com.example.harry.tujuhkeajaibandunia;

import android.os.Parcel;
import android.os.Parcelable;

public class Keajaiban implements Parcelable {
    private String name, remarks, photo;
    private String regional, koordinat, keterangan;

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public String getKoordinat() {
        return koordinat;
    }

    public void setKoordinat(String koordinat) {
        this.koordinat = koordinat;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.regional);
        dest.writeString(this.koordinat);
        dest.writeString(this.keterangan);
    }

    Keajaiban(){
    }

    private Keajaiban(Parcel in){
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.regional = in.readString();
        this.koordinat = in.readString();
        this.keterangan = in.readString();
    }

    public static final Parcelable.Creator<Keajaiban> CREATOR = new Parcelable.Creator<Keajaiban>() {
        @Override
        public Keajaiban createFromParcel(Parcel source) {
            return new Keajaiban(source);
        }

        @Override
        public Keajaiban[] newArray(int size) {
            return new Keajaiban[size];
        }
    };
}
