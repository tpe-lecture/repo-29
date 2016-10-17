package tpe.chart_example;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 * Fenster mit der Torten-Grafik.
 */
public final class PieChart {

    /**
     * Konstruktor.
     */
    private PieChart() {
        // keine Objekte benötigt.
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente
     */
    public static void main(String[] args) {

        final String title = "Welches ist Euer Lieblingsspiel?";

        JFrame jframe = new JFrame(title);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultPieDataset dataset  = new DefaultPieDataset();
        dataset.setValue("GTA V", 20);
        dataset.setValue("Witcher 3", 25);
        dataset.setValue("Fallout 4", 15);
        dataset.setValue("CS-GO", 40);
        dataset.setValue("Trackmania", 20);
        dataset.setValue("Pokemon", 40);
        dataset.setValue("GranTurismo", 32);
        dataset.setValue("FIFA17", 46);
        dataset.setValue("Mouse", 20);
        dataset.setValue("TombRider", 30);
        dataset.setValue("Blade", 32);
        dataset.setValue("PES17", 46);
        dataset.setValue("1", 20);
        dataset.setValue("3", 25);
        dataset.setValue("4", 15);
        dataset.setValue("2", 40);
        dataset.setValue("5", 20);
        dataset.setValue("6", 40);
        dataset.setValue("7", 32);
        dataset.setValue("8", 46);


        JFreeChart chart = ChartFactory.createPieChart3D(
                title,
                dataset,
                true,
                true,
                false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setForegroundAlpha(0.6f);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 470));
        jframe.setContentPane(chartPanel);
        jframe.pack();
        jframe.setVisible(true);
    }
}
