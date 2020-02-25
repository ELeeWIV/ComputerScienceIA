Package GUI2;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUIControl2 extends JFrame implements ItemListener {
  private JButton next, previous;
  private Date[] datelist;
  private DateSorter ds;
  private ClassEvent ce;
  private int i;

  public GUIControl2() {
    i = 0;
    ds = new DateSorter();
    datelist = new Date[ds.returnLength()];
    datelist = ds.sort();
    next = new JButton("Next Needed Class");
    ce = new ClassEvent(dateList[i]);
    next.addActionListener (new ActionListener () {
      @Override
      public void actionPerformed ( ActionEvent e) {
        i++;
        remove(ce);
        ce = new ClassEvent[i];
        add(ce);
      }
    });
    previous = new JButton("Previous Needed Class");
    previous.addActionListener (new ActionListener () {
      @Override
      public void actionPreformed (ActionEvent e) {
        if (i == 0) {
          JOptionPane.showMessageDialog(frame,"This is the most recent event", "", JOptionPane.PLAIN_MESSAGE);
        }
        else {
          i--;
        }
        remove(ce);
        ce = new ClassEvent[i];
        add(ce);
      }
    });
    super("Date Organizer");
    SwingUtilities.invokeLater(new Runnable() {
      public void run (){
        setLayout (new GridBagLayout());
        setResizable(true);
        GridBagConstraints gc = new GridBagConstraints();
				gc.weightx = 0;
				gc.weighty = 0;
				gc.insets = new Insets(6, 6, 6, 6);

        gc.gridwidth(2);
        gc.gridx = 0;
        gc.gridy = 0;
        ce.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        add(ce, gc);

        gc.gridwidth(1);
        gc.gridx = 0;
        gc.gridy = 1;
        add(previous, gc);

        gc.gridx = 1;
        add(next, gc);
      }
    })

  }
  private class DatesSorter {
    private File folder;
    private File[] files;
    private ArrayList<Files> files2;
    private ArrayList<Date> dates;

    public DateSorter() {
      dates = new ArrayList<Date>;
      folder = new File ( "path");
      files2 = folder.listFiles();
      files = new File[files2.size];
      files = files2.toArray();
      sort();
    }
      public Date[] sort () {
        for (File i : files) {
          String j = files[i].toString();
          int d = (int) j.subString(0, 2);
          int m = (int) j.subString(3,5);
          int y = (int) j.subString(6, 8);
          int p = (int) j.subString(8, 9);
          int r = (int) j.subString(10, 11);
          Date date = new Date(d, m, y, p, r);
          dates.add(date);
        }
        for (int i = 0; i < dates.size() - 1; i++) {
          for(int j = i + 1; j < dates.size(); j++) {
            if (dates[i].getYear > dates[j].getYear) {
              Date temp = dates[i];
              dates[i] = dates[j];
              dates[j] = temp;
            }
          }
        }
        for (int i = 0; i < dates.size() - 1; i++) {
          for(int j = i + 1; j < dates.size(); j++) {
            if (dates[i].getMonth > dates[j].getMonth) {
              Date temp = dates[i];
              dates[i] = dates[j];
              dates[j] = temp;
            }
          }
        }
        for (int i = 0; i < dates.size() - 1; i++) {
          for(int j = i + 1; j < dates.size(); j++) {
            if (dates[i].getDay > dates[j].getDay) {
              Date temp = dates[i];
              dates[i] = dates[j];
              dates[j] = temp;
            }
          }
        }
        for (int i = 0; i < dates.size() - 1; i++) {
          for(int j = i + 1; j < dates.size(); j++) {
            if (dates[i].getPeriod > dates[j].getPeriod) {
              Date temp = dates[i];
              dates[i] = dates[j];
              dates[j] = temp;
            }
          }
        }
        return dates.toArray();
    }
      public int returnLength() {
        return file.length();
    }
  }
}
