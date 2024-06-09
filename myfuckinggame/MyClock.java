/*    */ package myfuckinggame;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.FlowLayout;
/*    */ import java.awt.Font;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Calendar;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ 
/*    */ 
/*    */ public class MyClock
/*    */   extends JFrame
/*    */ {
/*    */   JLabel timeLabel;
/*    */   JLabel dayLabel;
/*    */   JLabel dateLabel;
/*    */   SimpleDateFormat timeFormat;
/*    */   SimpleDateFormat dayFormat;
/*    */   
/*    */   MyClock() {
/* 25 */     setVisible(true);
/* 26 */     setDefaultCloseOperation(3);
/* 27 */     setSize(350, 210);
/* 28 */     setResizable(false);
/* 29 */     setTitle("my fucking clock");
/* 30 */     setLocationRelativeTo((Component)null);
/* 31 */     setLayout(new FlowLayout());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     this.timeLabel = new JLabel();
/* 40 */     this.dayLabel = new JLabel();
/* 41 */     this.dateLabel = new JLabel();
/*    */     
/* 43 */     add(this.timeLabel);
/* 44 */     add(this.dayLabel);
/* 45 */     add(this.dateLabel);
/*    */ 
/*    */     
/* 48 */     setVisible(true);
/* 49 */     setDay();
/* 50 */     setDate();
/* 51 */     setTime();
/*    */   }
/*    */   SimpleDateFormat dateFormat; Calendar calendar; String time; String day;
/*    */   String date;
/*    */   
/*    */   public void setDay() {
/* 57 */     this.dayLabel.setFont(new Font("Ink Free", 0, 35));
/* 58 */     this.dayLabel.setForeground(Color.black);
/* 59 */     this.dayFormat = new SimpleDateFormat("EEEE");
/* 60 */     this.day = this.dayFormat.format(Calendar.getInstance().getTime());
/* 61 */     this.dayLabel.setText(this.day);
/*    */   }
/*    */   
/*    */   public void setDate() {
/* 65 */     this.dateLabel.setFont(new Font("Ink Free", 0, 40));
/* 66 */     this.dateFormat = new SimpleDateFormat("dd:MM:YYYY");
/* 67 */     this.dateLabel.setForeground(Color.black);
/* 68 */     this.date = this.dateFormat.format(Calendar.getInstance().getTime());
/* 69 */     this.dateLabel.setText(this.date);
/*    */   }
/*    */   
/*    */   void setTime() {
/* 73 */     this.timeLabel.setFont(new Font("Verdana", 0, 50));
/* 74 */     this.timeLabel.setBackground(Color.black);
/* 75 */     this.timeLabel.setForeground(Color.green);
/* 76 */     this.timeLabel.setOpaque(true);
/* 77 */     this.timeFormat = new SimpleDateFormat("hh:mm:ss a");
/*    */     
/*    */     while (true) {
/* 80 */       this.time = this.timeFormat.format(Calendar.getInstance().getTime());
/* 81 */       this.timeLabel.setText(this.time);
/*    */       try {
/* 83 */         Thread.sleep(1000L);
/* 84 */       } catch (InterruptedException ex) {
/* 85 */         Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\Work Maybe\My Fucking Projects\my-clock\My Fucking Clock.jar!\myfuckinggame\MyClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */