package com.unisc.exercicioaula10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView txtTemp,txtUmidade, txtDew, txtPre,txtVe;
    public static final String json1 = "{\n" +
            "  \"weather\": [\n" +
            "    {\n" +
            "      \"temperature\": \"24.00\",\n" +
            "      \"humidity\": \"77.46\",\n" +
            "      \"dewpoint\": \"19.89\",\n" +
            "      \"pressure\": \"1011.72\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 13:54\"\n" +
            "    },\n" +
            " {\n" +
            "      \"temperature\": \"23.95\",\n" +
            "      \"humidity\": \"75.93\",\n" +
            "      \"dewpoint\": \"19.53\",\n" +
            "      \"pressure\": \"1011.81\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 13:44\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.15\",\n" +
            "      \"humidity\": \"73.73\",\n" +
            "      \"dewpoint\": \"19.26\",\n" +
            "      \"pressure\": \"1011.74\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 13:34\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.18\",\n" +
            "      \"humidity\": \"73.45\",\n" +
            "      \"dewpoint\": \"19.23\",\n" +
            "      \"pressure\": \"1011.65\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 13:24\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.35\",\n" +
            "      \"humidity\": \"71.71\",\n" +
            "      \"dewpoint\": \"19.02\",\n" +
            "      \"pressure\": \"1011.58\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 13:14\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.76\",\n" +
            "      \"humidity\": \"69.32\",\n" +
            "      \"dewpoint\": \"18.88\",\n" +
            "      \"pressure\": \"1011.45\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"22-Oct-2018 13:04\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.85\",\n" +
            "      \"humidity\": \"68.50\",\n" +
            "      \"dewpoint\": \"18.78\",\n" +
            "      \"pressure\": \"1011.44\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 12:54\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.95\",\n" +
            "      \"humidity\": \"67.00\",\n" +
            "      \"dewpoint\": \"18.52\",\n" +
            "      \"pressure\": \"1011.43\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"22-Oct-2018 12:44\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.92\",\n" +
            "      \"humidity\": \"66.05\",\n" +
            "      \"dewpoint\": \"18.27\",\n" +
            "      \"pressure\": \"1011.58\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 12:34\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.30\",\n" +
            "      \"humidity\": \"64.37\",\n" +
            "      \"dewpoint\": \"18.22\",\n" +
            "      \"pressure\": \"1011.67\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 12:24\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.74\",\n" +
            "      \"humidity\": \"61.62\",\n" +
            "      \"dewpoint\": \"17.94\",\n" +
            "      \"pressure\": \"1011.48\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 12:14\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.79\",\n" +
            "      \"humidity\": \"61.96\",\n" +
            "      \"dewpoint\": \"18.08\",\n" +
            "      \"pressure\": \"1011.49\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"22-Oct-2018 12:04\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.32\",\n" +
            "      \"humidity\": \"60.89\",\n" +
            "      \"dewpoint\": \"17.35\",\n" +
            "      \"pressure\": \"1011.65\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 11:54\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.51\",\n" +
            "      \"humidity\": \"62.35\",\n" +
            "      \"dewpoint\": \"17.91\",\n" +
            "      \"pressure\": \"1011.64\",\n" +
            "      \"speed\": \"10.64\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"22-Oct-2018 11:44\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.25\",\n" +
            "      \"humidity\": \"63.28\",\n" +
            "      \"dewpoint\": \"17.90\",\n" +
            "      \"pressure\": \"1011.75\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 11:34\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.12\",\n" +
            "      \"humidity\": \"64.13\",\n" +
            "      \"dewpoint\": \"17.99\",\n" +
            "      \"pressure\": \"1011.55\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"22-Oct-2018 11:24\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.55\",\n" +
            "      \"humidity\": \"60.58\",\n" +
            "      \"dewpoint\": \"17.49\",\n" +
            "      \"pressure\": \"1011.64\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 11:14\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.16\",\n" +
            "      \"humidity\": \"58.45\",\n" +
            "      \"dewpoint\": \"17.49\",\n" +
            "      \"pressure\": \"1011.86\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 11:04\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.19\",\n" +
            "      \"humidity\": \"58.23\",\n" +
            "      \"dewpoint\": \"17.46\",\n" +
            "      \"pressure\": \"1011.90\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 10:54\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.11\",\n" +
            "      \"humidity\": \"59.08\",\n" +
            "      \"dewpoint\": \"17.62\",\n" +
            "      \"pressure\": \"1012.06\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 10:44\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.53\",\n" +
            "      \"humidity\": \"58.26\",\n" +
            "      \"dewpoint\": \"17.78\",\n" +
            "      \"pressure\": \"1011.98\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 10:34\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.39\",\n" +
            "      \"humidity\": \"58.21\",\n" +
            "      \"dewpoint\": \"17.64\",\n" +
            "      \"pressure\": \"1012.29\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 10:24\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.55\",\n" +
            "      \"humidity\": \"58.15\",\n" +
            "      \"dewpoint\": \"17.77\",\n" +
            "      \"pressure\": \"1012.32\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 10:14\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.67\",\n" +
            "      \"humidity\": \"57.05\",\n" +
            "      \"dewpoint\": \"17.58\",\n" +
            "      \"pressure\": \"1012.43\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"22-Oct-2018 10:04\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.42\",\n" +
            "      \"humidity\": \"57.69\",\n" +
            "      \"dewpoint\": \"17.52\",\n" +
            "      \"pressure\": \"1012.25\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 09:54\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.68\",\n" +
            "      \"humidity\": \"57.40\",\n" +
            "      \"dewpoint\": \"17.69\",\n" +
            "      \"pressure\": \"1012.36\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 09:44\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.70\",\n" +
            "      \"humidity\": \"56.78\",\n" +
            "      \"dewpoint\": \"17.53\",\n" +
            "      \"pressure\": \"1012.54\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 09:34\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.72\",\n" +
            "      \"humidity\": \"57.54\",\n" +
            "      \"dewpoint\": \"17.76\",\n" +
            "      \"pressure\": \"1012.71\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 09:24\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.31\",\n" +
            "      \"humidity\": \"59.76\",\n" +
            "      \"dewpoint\": \"17.99\",\n" +
            "      \"pressure\": \"1012.78\",\n" +
            "      \"speed\": \"11.97\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 09:14\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.12\",\n" +
            "      \"humidity\": \"59.82\",\n" +
            "      \"dewpoint\": \"17.83\",\n" +
            "      \"pressure\": \"1012.89\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 09:04\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.17\",\n" +
            "      \"humidity\": \"60.14\",\n" +
            "      \"dewpoint\": \"17.96\",\n" +
            "      \"pressure\": \"1012.98\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 08:54\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.23\",\n" +
            "      \"humidity\": \"59.38\",\n" +
            "      \"dewpoint\": \"17.81\",\n" +
            "      \"pressure\": \"1013.10\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 08:44\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.53\",\n" +
            "      \"humidity\": \"59.18\",\n" +
            "      \"dewpoint\": \"18.04\",\n" +
            "      \"pressure\": \"1013.23\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"22-Oct-2018 08:34\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.36\",\n" +
            "      \"humidity\": \"59.95\",\n" +
            "      \"dewpoint\": \"18.09\",\n" +
            "      \"pressure\": \"1013.23\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 08:24\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.46\",\n" +
            "      \"humidity\": \"60.30\",\n" +
            "      \"dewpoint\": \"18.28\",\n" +
            "      \"pressure\": \"1013.50\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 08:14\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.75\",\n" +
            "      \"humidity\": \"58.31\",\n" +
            "      \"dewpoint\": \"18.01\",\n" +
            "      \"pressure\": \"1013.43\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"22-Oct-2018 08:04\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.84\",\n" +
            "      \"humidity\": \"59.42\",\n" +
            "      \"dewpoint\": \"18.40\",\n" +
            "      \"pressure\": \"1013.42\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 07:54\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.88\",\n" +
            "      \"humidity\": \"58.41\",\n" +
            "      \"dewpoint\": \"18.16\",\n" +
            "      \"pressure\": \"1013.65\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 07:44\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"27.29\",\n" +
            "      \"humidity\": \"58.76\",\n" +
            "      \"dewpoint\": \"18.64\",\n" +
            "      \"pressure\": \"1013.91\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 07:34\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.96\",\n" +
            "      \"humidity\": \"59.12\",\n" +
            "      \"dewpoint\": \"18.43\",\n" +
            "      \"pressure\": \"1013.96\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 07:24\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.45\",\n" +
            "      \"humidity\": \"58.39\",\n" +
            "      \"dewpoint\": \"17.75\",\n" +
            "      \"pressure\": \"1013.99\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 07:14\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.70\",\n" +
            "      \"humidity\": \"58.17\",\n" +
            "      \"dewpoint\": \"17.92\",\n" +
            "      \"pressure\": \"1014.13\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 07:04\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.71\",\n" +
            "      \"humidity\": \"57.36\",\n" +
            "      \"dewpoint\": \"17.70\",\n" +
            "      \"pressure\": \"1014.28\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 06:54\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.54\",\n" +
            "      \"humidity\": \"58.45\",\n" +
            "      \"dewpoint\": \"17.85\",\n" +
            "      \"pressure\": \"1014.38\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 06:44\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.15\",\n" +
            "      \"humidity\": \"58.54\",\n" +
            "      \"dewpoint\": \"17.51\",\n" +
            "      \"pressure\": \"1014.49\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 06:34\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.14\",\n" +
            "      \"humidity\": \"58.16\",\n" +
            "      \"dewpoint\": \"17.39\",\n" +
            "      \"pressure\": \"1014.62\",\n" +
            "      \"speed\": \"10.64\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 06:24\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.90\",\n" +
            "      \"humidity\": \"58.81\",\n" +
            "      \"dewpoint\": \"17.34\",\n" +
            "      \"pressure\": \"1014.65\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 06:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.10\",\n" +
            "      \"humidity\": \"58.48\",\n" +
            "      \"dewpoint\": \"17.44\",\n" +
            "      \"pressure\": \"1014.72\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 06:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.90\",\n" +
            "      \"humidity\": \"59.59\",\n" +
            "      \"dewpoint\": \"17.56\",\n" +
            "      \"pressure\": \"1014.97\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 05:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.70\",\n" +
            "      \"humidity\": \"58.81\",\n" +
            "      \"dewpoint\": \"17.15\",\n" +
            "      \"pressure\": \"1014.80\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 05:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.10\",\n" +
            "      \"humidity\": \"60.20\",\n" +
            "      \"dewpoint\": \"16.96\",\n" +
            "      \"pressure\": \"1014.76\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 05:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.95\",\n" +
            "      \"humidity\": \"60.05\",\n" +
            "      \"dewpoint\": \"16.78\",\n" +
            "      \"pressure\": \"1014.76\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 05:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.14\",\n" +
            "      \"humidity\": \"61.26\",\n" +
            "      \"dewpoint\": \"17.28\",\n" +
            "      \"pressure\": \"1014.89\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"22-Oct-2018 05:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.76\",\n" +
            "      \"humidity\": \"60.48\",\n" +
            "      \"dewpoint\": \"16.71\",\n" +
            "      \"pressure\": \"1014.92\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"22-Oct-2018 05:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.43\",\n" +
            "      \"humidity\": \"61.49\",\n" +
            "      \"dewpoint\": \"16.67\",\n" +
            "      \"pressure\": \"1014.95\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 04:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.34\",\n" +
            "      \"humidity\": \"64.08\",\n" +
            "      \"dewpoint\": \"17.23\",\n" +
            "      \"pressure\": \"1014.86\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 04:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.86\",\n" +
            "      \"humidity\": \"62.93\",\n" +
            "      \"dewpoint\": \"16.49\",\n" +
            "      \"pressure\": \"1015.00\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 04:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.49\",\n" +
            "      \"humidity\": \"60.92\",\n" +
            "      \"dewpoint\": \"16.57\",\n" +
            "      \"pressure\": \"1014.68\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 04:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.46\",\n" +
            "      \"humidity\": \"58.24\",\n" +
            "      \"dewpoint\": \"16.77\",\n" +
            "      \"pressure\": \"1014.84\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 04:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.79\",\n" +
            "      \"humidity\": \"65.09\",\n" +
            "      \"dewpoint\": \"16.96\",\n" +
            "      \"pressure\": \"1014.96\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 04:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.77\",\n" +
            "      \"humidity\": \"55.56\",\n" +
            "      \"dewpoint\": \"16.31\",\n" +
            "      \"pressure\": \"1014.91\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 03:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.76\",\n" +
            "      \"humidity\": \"57.61\",\n" +
            "      \"dewpoint\": \"16.88\",\n" +
            "      \"pressure\": \"1014.94\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 03:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.89\",\n" +
            "      \"humidity\": \"63.68\",\n" +
            "      \"dewpoint\": \"16.71\",\n" +
            "      \"pressure\": \"1014.95\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 03:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.53\",\n" +
            "      \"humidity\": \"74.59\",\n" +
            "      \"dewpoint\": \"15.94\",\n" +
            "      \"pressure\": \"1014.98\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 03:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.34\",\n" +
            "      \"humidity\": \"75.20\",\n" +
            "      \"dewpoint\": \"15.87\",\n" +
            "      \"pressure\": \"1014.86\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 03:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.32\",\n" +
            "      \"humidity\": \"75.07\",\n" +
            "      \"dewpoint\": \"15.83\",\n" +
            "      \"pressure\": \"1014.96\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 03:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.98\",\n" +
            "      \"humidity\": \"76.44\",\n" +
            "      \"dewpoint\": \"15.78\",\n" +
            "      \"pressure\": \"1014.80\",\n" +
            "      \"speed\": \"11.97\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 02:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.45\",\n" +
            "      \"humidity\": \"78.28\",\n" +
            "      \"dewpoint\": \"15.62\",\n" +
            "      \"pressure\": \"1014.84\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 02:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.18\",\n" +
            "      \"humidity\": \"78.89\",\n" +
            "      \"dewpoint\": \"15.47\",\n" +
            "      \"pressure\": \"1014.82\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"22-Oct-2018 02:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.01\",\n" +
            "      \"humidity\": \"79.67\",\n" +
            "      \"dewpoint\": \"15.46\",\n" +
            "      \"pressure\": \"1014.88\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 02:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.95\",\n" +
            "      \"humidity\": \"80.62\",\n" +
            "      \"dewpoint\": \"15.58\",\n" +
            "      \"pressure\": \"1014.87\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 02:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.97\",\n" +
            "      \"humidity\": \"82.04\",\n" +
            "      \"dewpoint\": \"15.86\",\n" +
            "      \"pressure\": \"1014.75\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 02:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.81\",\n" +
            "      \"humidity\": \"81.94\",\n" +
            "      \"dewpoint\": \"15.69\",\n" +
            "      \"pressure\": \"1014.58\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 01:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.76\",\n" +
            "      \"humidity\": \"80.57\",\n" +
            "      \"dewpoint\": \"15.38\",\n" +
            "      \"pressure\": \"1014.58\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 01:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.84\",\n" +
            "      \"humidity\": \"79.37\",\n" +
            "      \"dewpoint\": \"15.24\",\n" +
            "      \"pressure\": \"1014.47\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 01:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.90\",\n" +
            "      \"humidity\": \"78.64\",\n" +
            "      \"dewpoint\": \"15.15\",\n" +
            "      \"pressure\": \"1014.58\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 01:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.97\",\n" +
            "      \"humidity\": \"77.86\",\n" +
            "      \"dewpoint\": \"15.07\",\n" +
            "      \"pressure\": \"1014.40\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 01:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.15\",\n" +
            "      \"humidity\": \"77.04\",\n" +
            "      \"dewpoint\": \"15.09\",\n" +
            "      \"pressure\": \"1014.65\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 01:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.21\",\n" +
            "      \"humidity\": \"77.39\",\n" +
            "      \"dewpoint\": \"15.21\",\n" +
            "      \"pressure\": \"1014.51\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 00:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.16\",\n" +
            "      \"humidity\": \"77.06\",\n" +
            "      \"dewpoint\": \"15.10\",\n" +
            "      \"pressure\": \"1014.26\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"22-Oct-2018 00:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.08\",\n" +
            "      \"humidity\": \"76.68\",\n" +
            "      \"dewpoint\": \"14.95\",\n" +
            "      \"pressure\": \"1014.18\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 00:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.07\",\n" +
            "      \"humidity\": \"76.15\",\n" +
            "      \"dewpoint\": \"14.83\",\n" +
            "      \"pressure\": \"1014.33\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"22-Oct-2018 00:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.16\",\n" +
            "      \"humidity\": \"75.50\",\n" +
            "      \"dewpoint\": \"14.79\",\n" +
            "      \"pressure\": \"1014.51\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 00:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.17\",\n" +
            "      \"humidity\": \"75.69\",\n" +
            "      \"dewpoint\": \"14.84\",\n" +
            "      \"pressure\": \"1014.51\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"22-Oct-2018 00:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.17\",\n" +
            "      \"humidity\": \"75.47\",\n" +
            "      \"dewpoint\": \"14.80\",\n" +
            "      \"pressure\": \"1014.62\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 23:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.26\",\n" +
            "      \"humidity\": \"75.17\",\n" +
            "      \"dewpoint\": \"14.82\",\n" +
            "      \"pressure\": \"1014.76\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 23:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.18\",\n" +
            "      \"humidity\": \"75.79\",\n" +
            "      \"dewpoint\": \"14.87\",\n" +
            "      \"pressure\": \"1014.76\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 23:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.23\",\n" +
            "      \"humidity\": \"76.32\",\n" +
            "      \"dewpoint\": \"15.02\",\n" +
            "      \"pressure\": \"1014.76\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 23:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.36\",\n" +
            "      \"humidity\": \"75.89\",\n" +
            "      \"dewpoint\": \"15.06\",\n" +
            "      \"pressure\": \"1014.87\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 23:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.42\",\n" +
            "      \"humidity\": \"75.66\",\n" +
            "      \"dewpoint\": \"15.07\",\n" +
            "      \"pressure\": \"1014.90\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 23:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.48\",\n" +
            "      \"humidity\": \"75.43\",\n" +
            "      \"dewpoint\": \"15.09\",\n" +
            "      \"pressure\": \"1014.72\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 22:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.55\",\n" +
            "      \"humidity\": \"74.97\",\n" +
            "      \"dewpoint\": \"15.06\",\n" +
            "      \"pressure\": \"1014.78\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 22:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.63\",\n" +
            "      \"humidity\": \"74.40\",\n" +
            "      \"dewpoint\": \"15.02\",\n" +
            "      \"pressure\": \"1014.77\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 22:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.71\",\n" +
            "      \"humidity\": \"74.22\",\n" +
            "      \"dewpoint\": \"15.06\",\n" +
            "      \"pressure\": \"1014.83\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 22:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.73\",\n" +
            "      \"humidity\": \"74.48\",\n" +
            "      \"dewpoint\": \"15.14\",\n" +
            "      \"pressure\": \"1014.78\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 22:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.77\",\n" +
            "      \"humidity\": \"74.66\",\n" +
            "      \"dewpoint\": \"15.21\",\n" +
            "      \"pressure\": \"1014.83\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 22:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.80\",\n" +
            "      \"humidity\": \"74.55\",\n" +
            "      \"dewpoint\": \"15.22\",\n" +
            "      \"pressure\": \"1014.88\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"21-Oct-2018 21:53\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.83\",\n" +
            "      \"humidity\": \"74.47\",\n" +
            "      \"dewpoint\": \"15.23\",\n" +
            "      \"pressure\": \"1014.80\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 21:43\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.85\",\n" +
            "      \"humidity\": \"74.25\",\n" +
            "      \"dewpoint\": \"15.21\",\n" +
            "      \"pressure\": \"1014.78\",\n" +
            "      \"speed\": \"11.97\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 21:33\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.89\",\n" +
            "      \"humidity\": \"74.77\",\n" +
            "      \"dewpoint\": \"15.35\",\n" +
            "      \"pressure\": \"1014.89\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 21:23\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.88\",\n" +
            "      \"humidity\": \"74.92\",\n" +
            "      \"dewpoint\": \"15.37\",\n" +
            "      \"pressure\": \"1015.07\",\n" +
            "      \"speed\": \"11.97\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 21:13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.89\",\n" +
            "      \"humidity\": \"75.10\",\n" +
            "      \"dewpoint\": \"15.42\",\n" +
            "      \"pressure\": \"1015.13\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 21:03\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.97\",\n" +
            "      \"humidity\": \"75.04\",\n" +
            "      \"dewpoint\": \"15.48\",\n" +
            "      \"pressure\": \"1015.08\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 20:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.08\",\n" +
            "      \"humidity\": \"74.58\",\n" +
            "      \"dewpoint\": \"15.50\",\n" +
            "      \"pressure\": \"1015.26\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 20:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.16\",\n" +
            "      \"humidity\": \"74.18\",\n" +
            "      \"dewpoint\": \"15.49\",\n" +
            "      \"pressure\": \"1015.40\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 20:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.24\",\n" +
            "      \"humidity\": \"73.92\",\n" +
            "      \"dewpoint\": \"15.52\",\n" +
            "      \"pressure\": \"1015.41\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 20:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.33\",\n" +
            "      \"humidity\": \"73.78\",\n" +
            "      \"dewpoint\": \"15.57\",\n" +
            "      \"pressure\": \"1015.43\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 20:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.53\",\n" +
            "      \"humidity\": \"74.04\",\n" +
            "      \"dewpoint\": \"15.82\",\n" +
            "      \"pressure\": \"1015.50\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 20:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.73\",\n" +
            "      \"humidity\": \"73.79\",\n" +
            "      \"dewpoint\": \"15.96\",\n" +
            "      \"pressure\": \"1015.71\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 19:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"20.91\",\n" +
            "      \"humidity\": \"73.48\",\n" +
            "      \"dewpoint\": \"16.07\",\n" +
            "      \"pressure\": \"1015.68\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 19:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.11\",\n" +
            "      \"humidity\": \"72.97\",\n" +
            "      \"dewpoint\": \"16.16\",\n" +
            "      \"pressure\": \"1015.50\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 19:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.22\",\n" +
            "      \"humidity\": \"72.33\",\n" +
            "      \"dewpoint\": \"16.13\",\n" +
            "      \"pressure\": \"1015.45\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 19:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.26\",\n" +
            "      \"humidity\": \"72.28\",\n" +
            "      \"dewpoint\": \"16.16\",\n" +
            "      \"pressure\": \"1015.50\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 19:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.32\",\n" +
            "      \"humidity\": \"72.95\",\n" +
            "      \"dewpoint\": \"16.36\",\n" +
            "      \"pressure\": \"1015.49\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 19:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.51\",\n" +
            "      \"humidity\": \"72.81\",\n" +
            "      \"dewpoint\": \"16.51\",\n" +
            "      \"pressure\": \"1015.60\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 18:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.42\",\n" +
            "      \"humidity\": \"72.31\",\n" +
            "      \"dewpoint\": \"16.32\",\n" +
            "      \"pressure\": \"1015.68\",\n" +
            "      \"speed\": \"15.96\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 18:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.50\",\n" +
            "      \"humidity\": \"72.53\",\n" +
            "      \"dewpoint\": \"16.44\",\n" +
            "      \"pressure\": \"1015.87\",\n" +
            "      \"speed\": \"10.64\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 18:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.46\",\n" +
            "      \"humidity\": \"72.25\",\n" +
            "      \"dewpoint\": \"16.35\",\n" +
            "      \"pressure\": \"1016.05\",\n" +
            "      \"speed\": \"13.30\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 18:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.45\",\n" +
            "      \"humidity\": \"72.65\",\n" +
            "      \"dewpoint\": \"16.42\",\n" +
            "      \"pressure\": \"1016.10\",\n" +
            "      \"speed\": \"13.30\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 18:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.45\",\n" +
            "      \"humidity\": \"72.22\",\n" +
            "      \"dewpoint\": \"16.33\",\n" +
            "      \"pressure\": \"1016.18\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 18:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.47\",\n" +
            "      \"humidity\": \"72.11\",\n" +
            "      \"dewpoint\": \"16.33\",\n" +
            "      \"pressure\": \"1016.27\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 17:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.46\",\n" +
            "      \"humidity\": \"71.95\",\n" +
            "      \"dewpoint\": \"16.28\",\n" +
            "      \"pressure\": \"1016.30\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 17:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.42\",\n" +
            "      \"humidity\": \"71.63\",\n" +
            "      \"dewpoint\": \"16.17\",\n" +
            "      \"pressure\": \"1016.35\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 17:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.47\",\n" +
            "      \"humidity\": \"71.76\",\n" +
            "      \"dewpoint\": \"16.25\",\n" +
            "      \"pressure\": \"1016.43\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 17:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.48\",\n" +
            "      \"humidity\": \"71.65\",\n" +
            "      \"dewpoint\": \"16.24\",\n" +
            "      \"pressure\": \"1016.54\",\n" +
            "      \"speed\": \"18.62\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 17:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.42\",\n" +
            "      \"humidity\": \"70.45\",\n" +
            "      \"dewpoint\": \"15.92\",\n" +
            "      \"pressure\": \"1016.55\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 17:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.47\",\n" +
            "      \"humidity\": \"70.44\",\n" +
            "      \"dewpoint\": \"15.96\",\n" +
            "      \"pressure\": \"1016.58\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 16:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.44\",\n" +
            "      \"humidity\": \"70.03\",\n" +
            "      \"dewpoint\": \"15.85\",\n" +
            "      \"pressure\": \"1016.69\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 16:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.40\",\n" +
            "      \"humidity\": \"69.64\",\n" +
            "      \"dewpoint\": \"15.72\",\n" +
            "      \"pressure\": \"1016.59\",\n" +
            "      \"speed\": \"13.30\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 16:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.47\",\n" +
            "      \"humidity\": \"70.20\",\n" +
            "      \"dewpoint\": \"15.91\",\n" +
            "      \"pressure\": \"1016.47\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 16:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.38\",\n" +
            "      \"humidity\": \"69.23\",\n" +
            "      \"dewpoint\": \"15.61\",\n" +
            "      \"pressure\": \"1016.58\",\n" +
            "      \"speed\": \"10.64\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 16:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.37\",\n" +
            "      \"humidity\": \"67.33\",\n" +
            "      \"dewpoint\": \"15.17\",\n" +
            "      \"pressure\": \"1016.62\",\n" +
            "      \"speed\": \"15.96\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 16:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.39\",\n" +
            "      \"humidity\": \"67.49\",\n" +
            "      \"dewpoint\": \"15.23\",\n" +
            "      \"pressure\": \"1016.60\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 15:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.47\",\n" +
            "      \"humidity\": \"67.69\",\n" +
            "      \"dewpoint\": \"15.35\",\n" +
            "      \"pressure\": \"1016.57\",\n" +
            "      \"speed\": \"10.64\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 15:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.50\",\n" +
            "      \"humidity\": \"66.73\",\n" +
            "      \"dewpoint\": \"15.16\",\n" +
            "      \"pressure\": \"1016.46\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 15:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.55\",\n" +
            "      \"humidity\": \"67.67\",\n" +
            "      \"dewpoint\": \"15.42\",\n" +
            "      \"pressure\": \"1016.56\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 15:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.49\",\n" +
            "      \"humidity\": \"66.85\",\n" +
            "      \"dewpoint\": \"15.18\",\n" +
            "      \"pressure\": \"1016.44\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 15:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.55\",\n" +
            "      \"humidity\": \"68.81\",\n" +
            "      \"dewpoint\": \"15.68\",\n" +
            "      \"pressure\": \"1016.37\",\n" +
            "      \"speed\": \"9.31\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 15:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.63\",\n" +
            "      \"humidity\": \"69.31\",\n" +
            "      \"dewpoint\": \"15.87\",\n" +
            "      \"pressure\": \"1016.39\",\n" +
            "      \"speed\": \"10.64\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 14:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.66\",\n" +
            "      \"humidity\": \"68.03\",\n" +
            "      \"dewpoint\": \"15.61\",\n" +
            "      \"pressure\": \"1016.29\",\n" +
            "      \"speed\": \"10.64\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 14:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.77\",\n" +
            "      \"humidity\": \"68.82\",\n" +
            "      \"dewpoint\": \"15.89\",\n" +
            "      \"pressure\": \"1016.17\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 14:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.82\",\n" +
            "      \"humidity\": \"68.48\",\n" +
            "      \"dewpoint\": \"15.87\",\n" +
            "      \"pressure\": \"1015.95\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 14:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"21.92\",\n" +
            "      \"humidity\": \"67.24\",\n" +
            "      \"dewpoint\": \"15.68\",\n" +
            "      \"pressure\": \"1016.10\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 14:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"22.07\",\n" +
            "      \"humidity\": \"66.13\",\n" +
            "      \"dewpoint\": \"15.56\",\n" +
            "      \"pressure\": \"1016.15\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 14:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"22.22\",\n" +
            "      \"humidity\": \"65.93\",\n" +
            "      \"dewpoint\": \"15.66\",\n" +
            "      \"pressure\": \"1016.24\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 13:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"22.46\",\n" +
            "      \"humidity\": \"65.15\",\n" +
            "      \"dewpoint\": \"15.70\",\n" +
            "      \"pressure\": \"1016.29\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 13:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"22.55\",\n" +
            "      \"humidity\": \"63.45\",\n" +
            "      \"dewpoint\": \"15.37\",\n" +
            "      \"pressure\": \"1016.36\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 13:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"22.69\",\n" +
            "      \"humidity\": \"64.69\",\n" +
            "      \"dewpoint\": \"15.81\",\n" +
            "      \"pressure\": \"1016.34\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 13:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.14\",\n" +
            "      \"humidity\": \"62.97\",\n" +
            "      \"dewpoint\": \"15.82\",\n" +
            "      \"pressure\": \"1016.30\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 13:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.27\",\n" +
            "      \"humidity\": \"62.08\",\n" +
            "      \"dewpoint\": \"15.72\",\n" +
            "      \"pressure\": \"1016.13\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 13:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.48\",\n" +
            "      \"humidity\": \"61.75\",\n" +
            "      \"dewpoint\": \"15.83\",\n" +
            "      \"pressure\": \"1016.22\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 12:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.51\",\n" +
            "      \"humidity\": \"59.54\",\n" +
            "      \"dewpoint\": \"15.29\",\n" +
            "      \"pressure\": \"1016.20\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 12:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.77\",\n" +
            "      \"humidity\": \"58.84\",\n" +
            "      \"dewpoint\": \"15.35\",\n" +
            "      \"pressure\": \"1016.28\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 12:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.76\",\n" +
            "      \"humidity\": \"57.98\",\n" +
            "      \"dewpoint\": \"15.10\",\n" +
            "      \"pressure\": \"1016.28\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 12:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.88\",\n" +
            "      \"humidity\": \"59.14\",\n" +
            "      \"dewpoint\": \"15.53\",\n" +
            "      \"pressure\": \"1016.31\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 12:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.07\",\n" +
            "      \"humidity\": \"59.33\",\n" +
            "      \"dewpoint\": \"15.76\",\n" +
            "      \"pressure\": \"1016.41\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 12:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.92\",\n" +
            "      \"humidity\": \"58.19\",\n" +
            "      \"dewpoint\": \"15.31\",\n" +
            "      \"pressure\": \"1016.49\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 11:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.02\",\n" +
            "      \"humidity\": \"58.57\",\n" +
            "      \"dewpoint\": \"15.51\",\n" +
            "      \"pressure\": \"1016.45\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 11:42\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.13\",\n" +
            "      \"humidity\": \"56.95\",\n" +
            "      \"dewpoint\": \"15.16\",\n" +
            "      \"pressure\": \"1016.40\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 11:32\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.23\",\n" +
            "      \"humidity\": \"56.54\",\n" +
            "      \"dewpoint\": \"15.14\",\n" +
            "      \"pressure\": \"1016.45\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 11:22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.33\",\n" +
            "      \"humidity\": \"55.23\",\n" +
            "      \"dewpoint\": \"14.87\",\n" +
            "      \"pressure\": \"1016.45\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 11:12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.56\",\n" +
            "      \"humidity\": \"53.67\",\n" +
            "      \"dewpoint\": \"14.62\",\n" +
            "      \"pressure\": \"1016.71\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 11:02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.50\",\n" +
            "      \"humidity\": \"54.29\",\n" +
            "      \"dewpoint\": \"14.75\",\n" +
            "      \"pressure\": \"1016.89\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 10:52\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.56\",\n" +
            "      \"humidity\": \"54.36\",\n" +
            "      \"dewpoint\": \"14.83\",\n" +
            "      \"pressure\": \"1016.99\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 10:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.20\",\n" +
            "      \"humidity\": \"55.13\",\n" +
            "      \"dewpoint\": \"14.71\",\n" +
            "      \"pressure\": \"1017.14\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 10:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.86\",\n" +
            "      \"humidity\": \"53.62\",\n" +
            "      \"dewpoint\": \"14.89\",\n" +
            "      \"pressure\": \"1017.26\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 10:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.74\",\n" +
            "      \"humidity\": \"54.50\",\n" +
            "      \"dewpoint\": \"15.04\",\n" +
            "      \"pressure\": \"1017.22\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 10:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.01\",\n" +
            "      \"humidity\": \"53.20\",\n" +
            "      \"dewpoint\": \"14.90\",\n" +
            "      \"pressure\": \"1017.37\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 10:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.93\",\n" +
            "      \"humidity\": \"53.17\",\n" +
            "      \"dewpoint\": \"14.82\",\n" +
            "      \"pressure\": \"1017.50\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 09:51\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.02\",\n" +
            "      \"humidity\": \"53.00\",\n" +
            "      \"dewpoint\": \"14.85\",\n" +
            "      \"pressure\": \"1017.60\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 09:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.21\",\n" +
            "      \"humidity\": \"53.44\",\n" +
            "      \"dewpoint\": \"15.16\",\n" +
            "      \"pressure\": \"1017.65\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 09:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.03\",\n" +
            "      \"humidity\": \"52.63\",\n" +
            "      \"dewpoint\": \"14.75\",\n" +
            "      \"pressure\": \"1017.75\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 09:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.19\",\n" +
            "      \"humidity\": \"52.74\",\n" +
            "      \"dewpoint\": \"14.93\",\n" +
            "      \"pressure\": \"1017.90\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 09:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.09\",\n" +
            "      \"humidity\": \"52.82\",\n" +
            "      \"dewpoint\": \"14.86\",\n" +
            "      \"pressure\": \"1017.96\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 09:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.80\",\n" +
            "      \"humidity\": \"52.39\",\n" +
            "      \"dewpoint\": \"14.46\",\n" +
            "      \"pressure\": \"1018.06\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 08:51\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.26\",\n" +
            "      \"humidity\": \"50.90\",\n" +
            "      \"dewpoint\": \"14.43\",\n" +
            "      \"pressure\": \"1018.18\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 08:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.33\",\n" +
            "      \"humidity\": \"50.04\",\n" +
            "      \"dewpoint\": \"14.22\",\n" +
            "      \"pressure\": \"1018.22\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 08:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.61\",\n" +
            "      \"humidity\": \"51.17\",\n" +
            "      \"dewpoint\": \"14.84\",\n" +
            "      \"pressure\": \"1018.39\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 08:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.52\",\n" +
            "      \"humidity\": \"49.93\",\n" +
            "      \"dewpoint\": \"14.36\",\n" +
            "      \"pressure\": \"1018.40\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 08:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.20\",\n" +
            "      \"humidity\": \"50.50\",\n" +
            "      \"dewpoint\": \"14.25\",\n" +
            "      \"pressure\": \"1018.53\",\n" +
            "      \"speed\": \"7.98\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 08:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.50\",\n" +
            "      \"humidity\": \"50.29\",\n" +
            "      \"dewpoint\": \"14.46\",\n" +
            "      \"pressure\": \"1018.64\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 07:51\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.49\",\n" +
            "      \"humidity\": \"50.25\",\n" +
            "      \"dewpoint\": \"14.44\",\n" +
            "      \"pressure\": \"1018.77\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 07:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.58\",\n" +
            "      \"humidity\": \"50.78\",\n" +
            "      \"dewpoint\": \"14.69\",\n" +
            "      \"pressure\": \"1018.94\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 07:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.46\",\n" +
            "      \"humidity\": \"50.71\",\n" +
            "      \"dewpoint\": \"14.56\",\n" +
            "      \"pressure\": \"1019.00\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 07:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.68\",\n" +
            "      \"humidity\": \"48.37\",\n" +
            "      \"dewpoint\": \"14.01\",\n" +
            "      \"pressure\": \"1019.02\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"21-Oct-2018 07:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.26\",\n" +
            "      \"humidity\": \"49.44\",\n" +
            "      \"dewpoint\": \"13.97\",\n" +
            "      \"pressure\": \"1019.21\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 07:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.73\",\n" +
            "      \"humidity\": \"52.83\",\n" +
            "      \"dewpoint\": \"14.53\",\n" +
            "      \"pressure\": \"1019.24\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 06:51\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.80\",\n" +
            "      \"humidity\": \"47.52\",\n" +
            "      \"dewpoint\": \"13.83\",\n" +
            "      \"pressure\": \"1019.39\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"21-Oct-2018 06:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.04\",\n" +
            "      \"humidity\": \"48.26\",\n" +
            "      \"dewpoint\": \"14.30\",\n" +
            "      \"pressure\": \"1019.49\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 06:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.83\",\n" +
            "      \"humidity\": \"50.08\",\n" +
            "      \"dewpoint\": \"14.70\",\n" +
            "      \"pressure\": \"1019.56\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 06:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.15\",\n" +
            "      \"humidity\": \"50.79\",\n" +
            "      \"dewpoint\": \"14.30\",\n" +
            "      \"pressure\": \"1019.68\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 06:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.96\",\n" +
            "      \"humidity\": \"50.92\",\n" +
            "      \"dewpoint\": \"14.16\",\n" +
            "      \"pressure\": \"1019.73\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 06:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.22\",\n" +
            "      \"humidity\": \"50.53\",\n" +
            "      \"dewpoint\": \"14.28\",\n" +
            "      \"pressure\": \"1019.79\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 05:51\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.58\",\n" +
            "      \"humidity\": \"47.88\",\n" +
            "      \"dewpoint\": \"13.75\",\n" +
            "      \"pressure\": \"1019.86\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"21-Oct-2018 05:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.82\",\n" +
            "      \"humidity\": \"47.18\",\n" +
            "      \"dewpoint\": \"13.74\",\n" +
            "      \"pressure\": \"1019.85\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 05:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.52\",\n" +
            "      \"humidity\": \"48.67\",\n" +
            "      \"dewpoint\": \"13.96\",\n" +
            "      \"pressure\": \"1019.97\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 05:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.13\",\n" +
            "      \"humidity\": \"48.41\",\n" +
            "      \"dewpoint\": \"13.51\",\n" +
            "      \"pressure\": \"1019.93\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"21-Oct-2018 05:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.85\",\n" +
            "      \"humidity\": \"47.81\",\n" +
            "      \"dewpoint\": \"13.06\",\n" +
            "      \"pressure\": \"1020.04\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 05:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.38\",\n" +
            "      \"humidity\": \"50.18\",\n" +
            "      \"dewpoint\": \"13.39\",\n" +
            "      \"pressure\": \"1020.07\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 04:51\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.30\",\n" +
            "      \"humidity\": \"48.78\",\n" +
            "      \"dewpoint\": \"12.87\",\n" +
            "      \"pressure\": \"1020.00\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 04:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.58\",\n" +
            "      \"humidity\": \"46.25\",\n" +
            "      \"dewpoint\": \"12.29\",\n" +
            "      \"pressure\": \"1020.00\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 04:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"23.88\",\n" +
            "      \"humidity\": \"49.40\",\n" +
            "      \"dewpoint\": \"12.68\",\n" +
            "      \"pressure\": \"1019.88\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 04:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"27.21\",\n" +
            "      \"humidity\": \"41.50\",\n" +
            "      \"dewpoint\": \"12.97\",\n" +
            "      \"pressure\": \"1019.88\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 04:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"24.47\",\n" +
            "      \"humidity\": \"48.85\",\n" +
            "      \"dewpoint\": \"13.05\",\n" +
            "      \"pressure\": \"1019.90\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 04:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"25.13\",\n" +
            "      \"humidity\": \"45.21\",\n" +
            "      \"dewpoint\": \"12.43\",\n" +
            "      \"pressure\": \"1019.81\",\n" +
            "      \"speed\": \"5.32\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 03:51\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"26.76\",\n" +
            "      \"humidity\": \"45.32\",\n" +
            "      \"dewpoint\": \"13.96\",\n" +
            "      \"pressure\": \"1019.87\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"21-Oct-2018 03:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.78\",\n" +
            "      \"humidity\": \"64.66\",\n" +
            "      \"dewpoint\": \"13.03\",\n" +
            "      \"pressure\": \"1019.58\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 03:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.59\",\n" +
            "      \"humidity\": \"66.16\",\n" +
            "      \"dewpoint\": \"13.20\",\n" +
            "      \"pressure\": \"1019.59\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 03:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.86\",\n" +
            "      \"humidity\": \"63.90\",\n" +
            "      \"dewpoint\": \"12.93\",\n" +
            "      \"pressure\": \"1019.49\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 03:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.37\",\n" +
            "      \"humidity\": \"66.57\",\n" +
            "      \"dewpoint\": \"13.08\",\n" +
            "      \"pressure\": \"1019.43\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 03:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.93\",\n" +
            "      \"humidity\": \"67.36\",\n" +
            "      \"dewpoint\": \"12.84\",\n" +
            "      \"pressure\": \"1019.48\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 02:51\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.50\",\n" +
            "      \"humidity\": \"68.75\",\n" +
            "      \"dewpoint\": \"12.74\",\n" +
            "      \"pressure\": \"1019.54\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 02:41\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.33\",\n" +
            "      \"humidity\": \"69.07\",\n" +
            "      \"dewpoint\": \"12.65\",\n" +
            "      \"pressure\": \"1019.37\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 02:31\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.28\",\n" +
            "      \"humidity\": \"68.82\",\n" +
            "      \"dewpoint\": \"12.54\",\n" +
            "      \"pressure\": \"1019.60\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 02:21\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.17\",\n" +
            "      \"humidity\": \"69.26\",\n" +
            "      \"dewpoint\": \"12.53\",\n" +
            "      \"pressure\": \"1019.30\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 02:11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.30\",\n" +
            "      \"humidity\": \"68.31\",\n" +
            "      \"dewpoint\": \"12.45\",\n" +
            "      \"pressure\": \"1019.25\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 02:01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.38\",\n" +
            "      \"humidity\": \"67.86\",\n" +
            "      \"dewpoint\": \"12.43\",\n" +
            "      \"pressure\": \"1019.07\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NE\",\n" +
            "      \"datetime\": \"21-Oct-2018 01:50\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.42\",\n" +
            "      \"humidity\": \"69.02\",\n" +
            "      \"dewpoint\": \"12.72\",\n" +
            "      \"pressure\": \"1018.85\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"21-Oct-2018 01:40\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"18.68\",\n" +
            "      \"humidity\": \"67.71\",\n" +
            "      \"dewpoint\": \"12.68\",\n" +
            "      \"pressure\": \"1018.78\",\n" +
            "      \"speed\": \"6.65\",\n" +
            "      \"direction\": \"N\",\n" +
            "      \"datetime\": \"21-Oct-2018 01:30\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.35\",\n" +
            "      \"humidity\": \"66.03\",\n" +
            "      \"dewpoint\": \"12.94\",\n" +
            "      \"pressure\": \"1018.64\",\n" +
            "      \"speed\": \"3.99\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"21-Oct-2018 01:20\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.45\",\n" +
            "      \"humidity\": \"66.06\",\n" +
            "      \"dewpoint\": \"13.04\",\n" +
            "      \"pressure\": \"1018.61\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 01:10\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.47\",\n" +
            "      \"humidity\": \"66.73\",\n" +
            "      \"dewpoint\": \"13.22\",\n" +
            "      \"pressure\": \"1018.61\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 01:00\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.58\",\n" +
            "      \"humidity\": \"67.13\",\n" +
            "      \"dewpoint\": \"13.41\",\n" +
            "      \"pressure\": \"1018.52\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 00:50\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.60\",\n" +
            "      \"humidity\": \"66.55\",\n" +
            "      \"dewpoint\": \"13.30\",\n" +
            "      \"pressure\": \"1018.54\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 00:40\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.62\",\n" +
            "      \"humidity\": \"66.57\",\n" +
            "      \"dewpoint\": \"13.32\",\n" +
            "      \"pressure\": \"1018.58\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 00:30\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.61\",\n" +
            "      \"humidity\": \"65.89\",\n" +
            "      \"dewpoint\": \"13.16\",\n" +
            "      \"pressure\": \"1018.66\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 00:20\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.60\",\n" +
            "      \"humidity\": \"66.66\",\n" +
            "      \"dewpoint\": \"13.32\",\n" +
            "      \"pressure\": \"1018.73\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"21-Oct-2018 00:10\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.51\",\n" +
            "      \"humidity\": \"66.16\",\n" +
            "      \"dewpoint\": \"13.12\",\n" +
            "      \"pressure\": \"1018.70\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"W\",\n" +
            "      \"datetime\": \"21-Oct-2018 00:00\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.55\",\n" +
            "      \"humidity\": \"66.23\",\n" +
            "      \"dewpoint\": \"13.18\",\n" +
            "      \"pressure\": \"1018.68\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"20-Oct-2018 23:50\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.62\",\n" +
            "      \"humidity\": \"66.62\",\n" +
            "      \"dewpoint\": \"13.34\",\n" +
            "      \"pressure\": \"1018.63\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"20-Oct-2018 23:40\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.76\",\n" +
            "      \"humidity\": \"63.86\",\n" +
            "      \"dewpoint\": \"12.82\",\n" +
            "      \"pressure\": \"1018.64\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"20-Oct-2018 23:30\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.86\",\n" +
            "      \"humidity\": \"62.44\",\n" +
            "      \"dewpoint\": \"12.57\",\n" +
            "      \"pressure\": \"1018.77\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"20-Oct-2018 23:20\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.86\",\n" +
            "      \"humidity\": \"63.37\",\n" +
            "      \"dewpoint\": \"12.80\",\n" +
            "      \"pressure\": \"1018.76\",\n" +
            "      \"speed\": \"2.66\",\n" +
            "      \"direction\": \"SW\",\n" +
            "      \"datetime\": \"20-Oct-2018 23:10\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.82\",\n" +
            "      \"humidity\": \"64.86\",\n" +
            "      \"dewpoint\": \"13.12\",\n" +
            "      \"pressure\": \"1018.76\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"20-Oct-2018 23:00\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.85\",\n" +
            "      \"humidity\": \"61.84\",\n" +
            "      \"dewpoint\": \"12.41\",\n" +
            "      \"pressure\": \"1018.76\",\n" +
            "      \"speed\": \"1.33\",\n" +
            "      \"direction\": \"S\",\n" +
            "      \"datetime\": \"20-Oct-2018 22:50\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"temperature\": \"19.87\",\n" +
            "      \"humidity\": \"64.11\",\n" +
            "      \"dewpoint\": \"12.99\",\n" +
            "      \"pressure\": \"1018.88\",\n" +
            "      \"speed\": \"0.00\",\n" +
            "      \"direction\": \"NW\",\n" +
            "      \"datetime\": \"20-Oct-2018 22:40\"\n" +
            "    }"+
            "]\n"+
            "}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTemp = findViewById(R.id.txtTemp);
        txtUmidade = findViewById(R.id.txtUmidade);
        txtDew = findViewById(R.id.txtDew);
        txtPre = findViewById(R.id.txtPre);
        txtVe = findViewById(R.id.txtVe);
    }

    public void btnClique(View view) {
        int soma = 0;
        Double somaTemp = 0.0;
        Double somaHum = 0.0;
        Double somaDew = 0.0;
        Double somaPre = 0.0;
        Double somaSpeed = 0.0;
        try{
            JSONObject jsonObjectObject = new JSONObject(json1);
            JSONArray array = jsonObjectObject.getJSONArray("weather");
            for(int i = 0; i < array.length(); i ++){
                JSONObject json2 = array.getJSONObject(i);
                Log.d("tag",Double.toString(json2.getDouble("temperature")));
                somaTemp += json2.getDouble("temperature");
                somaHum += json2.getDouble("humidity");
                somaDew += json2.getDouble("dewpoint");
                somaPre += json2.getDouble("pressure");
                somaSpeed += json2.getDouble("speed");
                soma++;
            }
            Double temp = somaTemp/soma;
            txtTemp.setText("Temperatura: " + temp.toString());
            Double hum = somaHum/soma;
            txtUmidade.setText("Umidade: " + hum.toString());
            Double dew = somaDew/soma;
            txtDew.setText("Dewpoint: " + dew.toString());
            Double pre = somaPre/soma;
            txtPre.setText("Pressão: " + pre.toString());
            Double speed = somaSpeed/soma;
            txtVe.setText("Velocidade: " + speed.toString());

        }catch(JSONException e){

        }
    }
}
