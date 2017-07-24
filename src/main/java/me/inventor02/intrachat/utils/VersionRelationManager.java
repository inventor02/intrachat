package me.inventor02.intrachat.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import me.inventor02.intrachat.IntraChat;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class VersionRelationManager {
    public static final String VERSIONS_URL = "https://cloud.inventor02.me/intrachat/versions.json";

    private static JsonObject getJSON() {
        OkHttpClient client = new OkHttpClient();

        try {
            Request request = new Request.Builder()
                    .url(VERSIONS_URL)
                    .build();

            Response response = client.newCall(request).execute();

            Gson gson = new Gson();

            return gson.fromJson(response.body().string(), JsonObject.class);
        } catch(IOException e) {
            IntraChat.getInstance().getLogger().warning("Failed to connect to CDN to download versions.json. IntraChat will continue to function. " + e.getMessage());
        } catch(NullPointerException e) {
            IntraChat.getInstance().getLogger().warning("versions.json returned a NullPointerException and was not parsed. IntraChat will continue to function. " + e.getMessage());
        }

        return null;
    }

    public static String getMessage() {
        final JsonObject json = getJSON();

        final JsonObject jMessages = json.getAsJsonObject("messages");
        if(! jMessages.has(IntraChat.INTERNAL_VERSION + "")) {
            return "";
        }

        final JsonPrimitive jMessage = jMessages.getAsJsonPrimitive(IntraChat.INTERNAL_VERSION + "");
        return jMessage.toString();
    }

    public static boolean hasUpdatesAvailable() {
        final JsonObject json = getJSON();

        final JsonPrimitive jLatestVersion = json.getAsJsonPrimitive("latestVersion");

        return jLatestVersion.getAsInt() > IntraChat.INTERNAL_VERSION;
    }
}
