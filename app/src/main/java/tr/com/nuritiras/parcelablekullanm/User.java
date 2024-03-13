package tr.com.nuritiras.parcelablekullanm;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class User implements Parcelable {
    private String fistName;
    private String lastName;
    private int age;

    protected User(Parcel in) {
        fistName = in.readString();
        lastName = in.readString();
        age = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User(String fistName, String lastName, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(fistName);
        dest.writeString(lastName);
        dest.writeInt(age);
    }
}
