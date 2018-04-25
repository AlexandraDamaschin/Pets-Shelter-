package com.example.android.petshelter.data;

import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {

    //empty constructor
    private PetContract() {
    }

    //guaranteed to be unique on the device.
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    //use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact the content provider.
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    //Possible path (appended to base content URI for possible URI's)
    public static final String PATH_PETS = "pets";


    //inner class that defines the values for the pets table
    //each entry is a single pet
    public static final class PetEntry implements BaseColumns {

        // The content URI to access the pet data in the provider
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        //  Name of database table for pets
        public final static String TABLE_NAME = "pets";

        //Unique ID number for the pet (only for use in the database table).
        //Type: INTEGER
        public final static String _ID = BaseColumns._ID;

        // Name of the pet.
        // Type: TEXT
        public final static String COLUMN_PET_NAME = "name";

        // Breed of the pet.
        // Type: TEXT
        public final static String COLUMN_PET_BREED = "breed";

        //Gender of the pet.
        //The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE} or {@link #GENDER_FEMALE}.
        // Type: INTEGER
        public final static String COLUMN_PET_GENDER = "gender";

        // Weight of the pet.
        //Type: INTEGER
        public final static String COLUMN_PET_WEIGHT = "weight";

        //Possible values for the gender of the pet.
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}