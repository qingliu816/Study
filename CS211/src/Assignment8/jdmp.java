package jdmp;

import org.jdmp.core.algorithm.regression.LinearRegression;
import org.jdmp.core.dataset.DataSet;
import org.jdmp.core.dataset.ListDataSet;

public class jdmp {
  public static void main(String[] param) {
    // load example data set
    ListDataSet dataSet = DataSet.Factory.IRIS();

    // create a classifier
    LinearRegression classifier = new LinearRegression();

    // train the classifier using all data
    classifier.trainAll(dataSet);

    // use the classifier to make predictions
    classifier.predictAll(dataSet);

    // get the results
    double accurary = dataSet.getAccuracy();

    System.out.println("accuracy: " + accurary);
  }
}
