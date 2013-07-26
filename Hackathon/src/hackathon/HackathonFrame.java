/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import com.temboo.Library.NYTimes.MostPopular.GetMostViewed;
import com.temboo.core.TembooException;
import com.temboo.core.TembooSession;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author DUCAStudent
 */
public class HackathonFrame extends javax.swing.JFrame {
    private TembooSession session;
    private int time =1;

    /**
     * Creates new form HackathonFrame
     */
    public HackathonFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Arts = new javax.swing.JButton();
        US = new javax.swing.JButton();
        Technology = new javax.swing.JButton();
        Business = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        World = new javax.swing.JButton();
        Science = new javax.swing.JButton();
        Health = new javax.swing.JButton();
        Sports = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        day1 = new javax.swing.JButton();
        day7 = new javax.swing.JButton();
        day30 = new javax.swing.JButton();
        all_topics = new javax.swing.JButton();
        Random = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Arts.setText("Arts");
        Arts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtsActionPerformed(evt);
            }
        });

        US.setText("U.S");
        US.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USActionPerformed(evt);
            }
        });

        Technology.setText("Technology");
        Technology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TechnologyActionPerformed(evt);
            }
        });

        Business.setText("Business");
        Business.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusinessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Arts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(US, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Technology, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(Business, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Arts, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(US, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Business, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Technology, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        World.setText("World");
        World.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorldActionPerformed(evt);
            }
        });

        Science.setText("Science");
        Science.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScienceActionPerformed(evt);
            }
        });

        Health.setText("Health");
        Health.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthActionPerformed(evt);
            }
        });

        Sports.setText("Sports");
        Sports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(World, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(Science, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Sports, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Health, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(World, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Science, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Health, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sports, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jTextArea1.setBackground(new java.awt.Color(51, 102, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Ice Breakers!");
        jScrollPane1.setViewportView(jTextArea1);

        day1.setText("1");
        day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1ActionPerformed(evt);
            }
        });

        day7.setText("7");
        day7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day7ActionPerformed(evt);
            }
        });

        day30.setText("30");
        day30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day30ActionPerformed(evt);
            }
        });

        all_topics.setText("All Topics");
        all_topics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_topicsActionPerformed(evt);
            }
        });

        Random.setText("Random");
        Random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomActionPerformed(evt);
            }
        });

        jTextArea3.setBackground(new java.awt.Color(51, 102, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Time(In Days)");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(all_topics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(day1)
                            .addGap(10, 10, 10)
                            .addComponent(day7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(day30)))
                    .addComponent(Random, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Random, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(all_topics, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day1)
                    .addComponent(day7)
                    .addComponent(day30))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtsActionPerformed
        // TODO add your handling code here:
        //
        TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("arts");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ArtsActionPerformed

    private void USActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USActionPerformed
        // TODO add your handling code here:
        TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("U.S.");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_USActionPerformed

    private void TechnologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TechnologyActionPerformed
        // TODO add your handling code here:TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("technology");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_TechnologyActionPerformed

    private void BusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusinessActionPerformed
        // TODO add your handling code here:TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("business");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_BusinessActionPerformed

    private void WorldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorldActionPerformed
        // TODO add your handling code here:
        TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("world");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_WorldActionPerformed

    private void ScienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScienceActionPerformed
        // TODO add your handling code here:
        TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("science");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ScienceActionPerformed

    private void HealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthActionPerformed
        // TODO add your handling code here:
        TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("health");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_HealthActionPerformed

    private void SportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsActionPerformed
        // TODO add your handling code here:
        TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("sports");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SportsActionPerformed

    private void day30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day30ActionPerformed
        time = 30;
    }//GEN-LAST:event_day30ActionPerformed

    private void all_topicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_topicsActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        TembooSession session = null;
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section("all-sections");
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_all_topicsActionPerformed

    private void RandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        TembooSession session = null;
        String [] array = {"arts", "health" ,"U.S.", "science","technology",
            "all-sections", "business", "world", "sports"};
        
        try {
            session = new TembooSession("JewishTurtle", "myFirstApp", "e8448791-d096-4215-b" );
        } catch (TembooException ex) {
            Logger.getLogger(HackathonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewed.GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section(array[(int)(Math.random()*array.length)]);
        getMostViewedInputs.set_APIKey("94d68dd9d5fb9b79ee68604da8787ffe:2:67896757");
        getMostViewedInputs.set_TimePeriod(time);
        JSONArray children = null;
        try{
        GetMostViewed.GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        children = json.getJSONArray("results");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < children.length(); i++) {
            try{
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getString("title"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_RandomActionPerformed

    private void day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1ActionPerformed
        // TODO add your handling code here:
        time = 1;
    }//GEN-LAST:event_day1ActionPerformed

    private void day7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day7ActionPerformed
        // TODO add your handling code here:
        time = 7;
    }//GEN-LAST:event_day7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HackathonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HackathonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HackathonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HackathonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HackathonFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arts;
    private javax.swing.JButton Business;
    private javax.swing.JButton Health;
    private javax.swing.JButton Random;
    private javax.swing.JButton Science;
    private javax.swing.JButton Sports;
    private javax.swing.JButton Technology;
    private javax.swing.JButton US;
    private javax.swing.JButton World;
    private javax.swing.JButton all_topics;
    private javax.swing.JButton day1;
    private javax.swing.JButton day30;
    private javax.swing.JButton day7;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}