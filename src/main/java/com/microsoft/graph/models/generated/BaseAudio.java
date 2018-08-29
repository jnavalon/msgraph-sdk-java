// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Audio.
 */
public class BaseAudio implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Album.
     * The title of the album for this audio file.
     */
    @SerializedName("album")
    @Expose
    public String album;

    /**
     * The Album Artist.
     * The artist named on the album for the audio file.
     */
    @SerializedName("albumArtist")
    @Expose
    public String albumArtist;

    /**
     * The Artist.
     * The performing artist for the audio file.
     */
    @SerializedName("artist")
    @Expose
    public String artist;

    /**
     * The Bitrate.
     * Bitrate expressed in kbps.
     */
    @SerializedName("bitrate")
    @Expose
    public Long bitrate;

    /**
     * The Composers.
     * The name of the composer of the audio file.
     */
    @SerializedName("composers")
    @Expose
    public String composers;

    /**
     * The Copyright.
     * Copyright information for the audio file.
     */
    @SerializedName("copyright")
    @Expose
    public String copyright;

    /**
     * The Disc.
     * The number of the disc this audio file came from.
     */
    @SerializedName("disc")
    @Expose
    public Integer disc;

    /**
     * The Disc Count.
     * The total number of discs in this album.
     */
    @SerializedName("discCount")
    @Expose
    public Integer discCount;

    /**
     * The Duration.
     * Duration of the audio file, expressed in milliseconds
     */
    @SerializedName("duration")
    @Expose
    public Long duration;

    /**
     * The Genre.
     * The genre of this audio file.
     */
    @SerializedName("genre")
    @Expose
    public String genre;

    /**
     * The Has Drm.
     * Indicates if the file is protected with digital rights management.
     */
    @SerializedName("hasDrm")
    @Expose
    public Boolean hasDrm;

    /**
     * The Is Variable Bitrate.
     * Indicates if the file is encoded with a variable bitrate.
     */
    @SerializedName("isVariableBitrate")
    @Expose
    public Boolean isVariableBitrate;

    /**
     * The Title.
     * The title of the audio file.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Track.
     * The number of the track on the original disc for this audio file.
     */
    @SerializedName("track")
    @Expose
    public Integer track;

    /**
     * The Track Count.
     * The total number of tracks on the original disc for this audio file.
     */
    @SerializedName("trackCount")
    @Expose
    public Integer trackCount;

    /**
     * The Year.
     * The year the audio file was recorded.
     */
    @SerializedName("year")
    @Expose
    public Integer year;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
