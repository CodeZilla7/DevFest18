/*
 *  Copyright (C) 2018 Eton Otieno Oboch
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.gdgnairobi.devfest18.data.guardian

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GuardianResult(
        @SerializedName("id")
        @Expose
        val id: String,
        @SerializedName("type")
        @Expose
        val type: String,
        @SerializedName("sectionId")
        @Expose
        val sectionId: String,
        @SerializedName("webTitle")
        @Expose
        val webTitle: String,
        @SerializedName("webPublicationDate")
        @Expose
        val webPublicationDate: String,
        @SerializedName("fields")
        @Expose
        val fields: GuardianFields,
        @SerializedName("webUrl")
        @Expose
        val webUrl: String,
        @SerializedName("apiUrl")
        @Expose
        val apiUrl: String,
        @SerializedName("sectionName")
        @Expose
        val sectionName: String
)
