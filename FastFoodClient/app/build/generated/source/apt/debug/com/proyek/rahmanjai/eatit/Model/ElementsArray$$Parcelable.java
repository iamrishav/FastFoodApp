
package com.proyek.rahmanjai.eatit.Model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2019-05-13T23:11+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class ElementsArray$$Parcelable
    implements Parcelable, ParcelWrapper<com.proyek.rahmanjai.eatit.Model.ElementsArray>
{

    private com.proyek.rahmanjai.eatit.Model.ElementsArray elementsArray$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<ElementsArray$$Parcelable>CREATOR = new Creator<ElementsArray$$Parcelable>() {


        @Override
        public ElementsArray$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new ElementsArray$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public ElementsArray$$Parcelable[] newArray(int size) {
            return new ElementsArray$$Parcelable[size] ;
        }

    }
    ;

    public ElementsArray$$Parcelable(com.proyek.rahmanjai.eatit.Model.ElementsArray elementsArray$$2) {
        elementsArray$$0 = elementsArray$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(elementsArray$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.proyek.rahmanjai.eatit.Model.ElementsArray elementsArray$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(elementsArray$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(elementsArray$$1));
            if (elementsArray$$1 .elements == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(elementsArray$$1 .elements.size());
                for (com.proyek.rahmanjai.eatit.Model.DistanceDuration distanceDuration$$0 : ((java.util.ArrayList<com.proyek.rahmanjai.eatit.Model.DistanceDuration> ) elementsArray$$1 .elements)) {
                    com.proyek.rahmanjai.eatit.Model.DistanceDuration$$Parcelable.write(distanceDuration$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.proyek.rahmanjai.eatit.Model.ElementsArray getParcel() {
        return elementsArray$$0;
    }

    public static com.proyek.rahmanjai.eatit.Model.ElementsArray read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.proyek.rahmanjai.eatit.Model.ElementsArray elementsArray$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            elementsArray$$4 = new com.proyek.rahmanjai.eatit.Model.ElementsArray();
            identityMap$$1 .put(reservation$$0, elementsArray$$4);
            int int$$0 = parcel$$3 .readInt();
            java.util.ArrayList<com.proyek.rahmanjai.eatit.Model.DistanceDuration> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new java.util.ArrayList<com.proyek.rahmanjai.eatit.Model.DistanceDuration>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    com.proyek.rahmanjai.eatit.Model.DistanceDuration distanceDuration$$1 = com.proyek.rahmanjai.eatit.Model.DistanceDuration$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$0 .add(distanceDuration$$1);
                }
            }
            elementsArray$$4 .elements = list$$0;
            com.proyek.rahmanjai.eatit.Model.ElementsArray elementsArray$$3 = elementsArray$$4;
            identityMap$$1 .put(identity$$1, elementsArray$$3);
            return elementsArray$$3;
        }
    }

}
