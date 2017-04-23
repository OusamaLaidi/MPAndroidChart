package com.oussama.gdgtipaza.mpandroidchart.mpandroidchart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HorizontalBarChart barChart = (HorizontalBarChart) findViewById(R.id.chart);


        // Here to insert our Data

        ArrayList<BarEntry> entries = new ArrayList();
                entries.add(new BarEntry(4f, 0));
                entries.add(new BarEntry(8f, 1));
                entries.add(new BarEntry(6f, 2));
                entries.add(new BarEntry(12f, 3));
                entries.add(new BarEntry(18f, 4));
                entries.add(new BarEntry(9f, 5));

        BarDataSet dataset = new BarDataSet(entries,"Label");

        // define X-axis labels

        ArrayList<String>labels = new ArrayList<String>();
                labels.add("January");
                labels.add("February");
                labels.add("March");
                labels.add("April");
                labels.add("May");
                labels.add("June");

        BarData data = new BarData(labels,dataset);
        barChart.setDescription("This is just a test !");
        barChart.setData(data); // set the data and list of lables into chart


        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        }

    }

