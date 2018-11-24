package sample;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Measurements {

    public static String fakeData(){
        return "{\"meta\":{\"name\":\"openaq-api\",\"license\":\"CC BY 4.0\",\"website\":\"https://docs.openaq.org/\",\"page\":1,\"limit\":100,\"found\":333467},\"results\":[{\"location\":\"Experimental Lakes\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T20:00:00-06:00\"},\"value\":0.029,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.6639,\"longitude\":-93.7211},\"country\":\"CA\",\"city\":\"ONTARIO\"},{\"location\":\"Algoma\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.031,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":47.035,\"longitude\":-84.3811},\"country\":\"CA\",\"city\":\"ONTARIO\"},{\"location\":\"Egbert\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.03,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":44.2325,\"longitude\":-79.7814},\"country\":\"CA\",\"city\":\"ONTARIO\"},{\"location\":\"Pickle Lake\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.028,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":54.4494,\"longitude\":-90.2175},\"country\":\"CA\",\"city\":\"ONTARIO\"},{\"location\":\"Pinehouse Lake\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T20:00:00-06:00\"},\"value\":0.022,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":55.50333,\"longitude\":-106.72167},\"country\":\"CA\",\"city\":\"SASKATCHEWAN\"},{\"location\":\"Kensington Park\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.012,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.2794,\"longitude\":-122.9711},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Kensington Park\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":6.7,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.2794,\"longitude\":-122.9711},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Rocky Point Park\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":8.3,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.28083,\"longitude\":-122.84917},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Burnaby South\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.012,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.21528,\"longitude\":-122.98556},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Burnaby South\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":12.2,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.21528,\"longitude\":-122.98556},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"North Delta\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.005,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.15833,\"longitude\":-122.90167},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"North Delta\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":10.4,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.15833,\"longitude\":-122.90167},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Surrey East\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.003,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.13278,\"longitude\":-122.69417},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Surrey East\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":8.2,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.13278,\"longitude\":-122.69417},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Richmond South\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.003,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.14139,\"longitude\":-123.10833},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Richmond South\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":13.2,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.14139,\"longitude\":-123.10833},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Mahon Park\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.02,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.323891,\"longitude\":-123.083611},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Mahon Park\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":6.2,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.323891,\"longitude\":-123.083611},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Vancouver Airport\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.004,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.18639,\"longitude\":-123.15222},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Vancouver Airport\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":11.3,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.18639,\"longitude\":-123.15222},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Coquitlam\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.015,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.28806,\"longitude\":-122.79139},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Tsawwassen\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.022,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.009869,\"longitude\":-123.082017},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Tsawwassen\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":5.9,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.009869,\"longitude\":-123.082017},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Abbotsford\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.04278,\"longitude\":-122.30972},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Abbotsford\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":10.5,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.04278,\"longitude\":-122.30972},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Abbotsford Airport\",\"parameter\":\"co\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.19,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.021506,\"longitude\":-122.326556},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Abbotsford Airport\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.014,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.021506,\"longitude\":-122.326556},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Abbotsford Airport\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.005,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.021506,\"longitude\":-122.326556},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Abbotsford Airport\",\"parameter\":\"pm10\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":8,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.021506,\"longitude\":-122.326556},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Abbotsford Airport\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":13.5,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.021506,\"longitude\":-122.326556},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Abbotsford Airport\",\"parameter\":\"so2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.021506,\"longitude\":-122.326556},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Chilliwack\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.001,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.15611,\"longitude\":-121.94056},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Chilliwack\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":13.3,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.15611,\"longitude\":-121.94056},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Pitt Meadows\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.026,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.24528,\"longitude\":-122.70889},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Pitt Meadows\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":1.9,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.24528,\"longitude\":-122.70889},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Langley\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.007,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.09556,\"longitude\":-122.56694},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Langley\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":7.7,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.09556,\"longitude\":-122.56694},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Hope\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.001,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.36972,\"longitude\":-121.49944},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Hope\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":12.4,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":49.36972,\"longitude\":-121.49944},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Maple Ridge\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.008,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":49.215,\"longitude\":-122.58194},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Saturna\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T18:00:00-08:00\"},\"value\":0.022,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":48.7833,\"longitude\":-123.1333},\"country\":\"CA\",\"city\":\"BRITISH COLUMBIA\"},{\"location\":\"Snare Rapids\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T19:00:00-07:00\"},\"value\":0.03,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":63.5086,\"longitude\":-116.0078},\"country\":\"CA\",\"city\":\"NORTHWEST TERRITORIES\"},{\"location\":\"Wood Buffalo Park\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T19:00:00-07:00\"},\"value\":0.017,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":60.1465,\"longitude\":-113.63769},\"country\":\"CA\",\"city\":\"NORTHWEST TERRITORIES\"},{\"location\":\"Flat Valley\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T20:00:00-06:00\"},\"value\":0.017,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":54.294639,\"longitude\":-109.209214},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Joussard\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T19:00:00-07:00\"},\"value\":0.006,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":55.340367,\"longitude\":-115.895667},\"country\":\"CA\",\"city\":\"ALBERTA\"},{\"location\":\"Sainte-Anne-de-Belle\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.426509,\"longitude\":-73.928944},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Sainte-Anne-de-Belle\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.03,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.426509,\"longitude\":-73.928944},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Sainte-Anne-de-Belle\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.6,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.426509,\"longitude\":-73.928944},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Sainte-Anne-de-Belle\",\"parameter\":\"so2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.426509,\"longitude\":-73.928944},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Aéroport de Montréal\",\"parameter\":\"co\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.11,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.468297,\"longitude\":-73.741185},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Aéroport de Montréal\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.002,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.468297,\"longitude\":-73.741185},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Aéroport de Montréal\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.026,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.468297,\"longitude\":-73.741185},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Aéroport de Montréal\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":2.6,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.468297,\"longitude\":-73.741185},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Rivière-des-Prairies\",\"parameter\":\"co\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.17,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.651722,\"longitude\":-73.573896},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Rivière-des-Prairies\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.001,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.651722,\"longitude\":-73.573896},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Rivière-des-Prairies\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.027,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.651722,\"longitude\":-73.573896},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Rivière-des-Prairies\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":2.2,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.651722,\"longitude\":-73.573896},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Hochelaga\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":3.3,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.539928,\"longitude\":-73.540388},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Chenier\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.006,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.60176,\"longitude\":-73.541992},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Chenier\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":2.5,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.60176,\"longitude\":-73.541992},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Chenier\",\"parameter\":\"so2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.60176,\"longitude\":-73.541992},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Molson\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.004,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.542767,\"longitude\":-73.572039},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Molson\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.025,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.542767,\"longitude\":-73.572039},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Molson\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":3.1,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.542767,\"longitude\":-73.572039},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Molson\",\"parameter\":\"so2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.542767,\"longitude\":-73.572039},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Caserne 17\",\"parameter\":\"co\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.14,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.593325,\"longitude\":-73.637328},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Caserne 17\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":0.026,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.593325,\"longitude\":-73.637328},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"Caserne 17\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":5.5,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.593325,\"longitude\":-73.637328},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"St-Dominique\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":4.3,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.512189,\"longitude\":-73.566872},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"York-Roberval\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T21:00:00-05:00\"},\"value\":4,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.512189,\"longitude\":-73.566872},\"country\":\"CA\",\"city\":\"N/A\"},{\"location\":\"St. John's\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.029,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":47.6528,\"longitude\":-52.8167},\"country\":\"CA\",\"city\":\"NEWFOUNDLAND\"},{\"location\":\"Mount Pearl\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.027,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":47.505,\"longitude\":-52.7947},\"country\":\"CA\",\"city\":\"NEWFOUNDLAND\"},{\"location\":\"Mount Pearl\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":10,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":47.505,\"longitude\":-52.7947},\"country\":\"CA\",\"city\":\"NEWFOUNDLAND\"},{\"location\":\"Port au Choix\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.026,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":50.71124,\"longitude\":-57.36365},\"country\":\"CA\",\"city\":\"NEWFOUNDLAND\"},{\"location\":\"Marystown/Burin\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":5,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":47.098991,\"longitude\":-55.198521},\"country\":\"CA\",\"city\":\"NEWFOUNDLAND\"},{\"location\":\"CHARLOTTETOWN\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.002,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.2406,\"longitude\":-63.1306},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"CHARLOTTETOWN\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.027,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.2406,\"longitude\":-63.1306},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"CHARLOTTETOWN\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":10,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":46.2406,\"longitude\":-63.1306},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"WELLINGTON\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.001,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.4783,\"longitude\":-63.9869},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"WELLINGTON\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.025,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.4783,\"longitude\":-63.9869},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"WELLINGTON\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":-1,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":46.4783,\"longitude\":-63.9869},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"SOUTHAMPTON\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.3864,\"longitude\":-62.5828},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"SOUTHAMPTON\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.028,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.3864,\"longitude\":-62.5828},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"SOUTHAMPTON\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":4,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":46.3864,\"longitude\":-62.5828},\"country\":\"CA\",\"city\":\"PRINCE EDWARD ISLAND\"},{\"location\":\"Lake Major\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.029,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":44.7197,\"longitude\":-63.4819},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"Lake Major\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":6,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":44.7197,\"longitude\":-63.4819},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"PORT HAWKESBURY\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.002,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.61394,\"longitude\":-61.36235},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"PORT HAWKESBURY\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.029,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.61394,\"longitude\":-61.36235},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"PORT HAWKESBURY\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":10,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.61394,\"longitude\":-61.36235},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"SYDNEY\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.001,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.1425,\"longitude\":-60.1728},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"SYDNEY\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.032,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.1425,\"longitude\":-60.1728},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"SYDNEY\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":4,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":46.1425,\"longitude\":-60.1728},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"SYDNEY\",\"parameter\":\"so2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":46.1425,\"longitude\":-60.1728},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"AYLESFORD MOUNTAIN\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.032,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.0061,\"longitude\":-65},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"AYLESFORD MOUNTAIN\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":8,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.0061,\"longitude\":-65},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"PICTOU\",\"parameter\":\"no2\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.002,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.6819,\"longitude\":-62.6953},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"PICTOU\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.025,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.6819,\"longitude\":-62.6953},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"PICTOU\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":6,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.6819,\"longitude\":-62.6953},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"KENTVILLE\",\"parameter\":\"o3\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":0.028,\"unit\":\"ppm\",\"coordinates\":{\"latitude\":45.04,\"longitude\":-64.29},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"},{\"location\":\"KENTVILLE\",\"parameter\":\"pm25\",\"date\":{\"utc\":\"2018-11-22T02:00:00.000Z\",\"local\":\"2018-11-21T22:00:00-04:00\"},\"value\":8,\"unit\":\"µg/m³\",\"coordinates\":{\"latitude\":45.04,\"longitude\":-64.29},\"country\":\"CA\",\"city\":\"NOVA SCOTIA\"}]}";
    }

    public static ArrayList<Float> readFromAPI(String country_code){
        String contents = "";

        return parseCountries(fakeData());

        /*try {
            URL address = new URL("https://api.openaq.org/v1/measurements?country="+country_code);
            InputStreamReader reader = new InputStreamReader(address.openStream());
            BufferedReader buffer = new BufferedReader(reader);

            String line = "";
            while((line = buffer.readLine())!= null){
                contents += line;
            }

            return parseCountries(contents);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
        */
    }

    public static ArrayList<Float> parseCountries(String contents){

        Gson parser = new Gson();
        JsonObject parsed = parser.fromJson(contents, JsonObject.class);
        JsonArray results = parsed.getAsJsonArray("results");

        ArrayList<Float> result = new ArrayList<Float>();

        for(JsonElement item:results){
            JsonObject location_item = item.getAsJsonObject();

            String parameter = location_item.getAsJsonPrimitive("parameter").getAsString();
            if (!parameter.equals("no2")) {
                continue;
            }

            Float value = location_item.getAsJsonPrimitive("value").getAsFloat();
            result.add(value);
        }

        return result;

    }

}
