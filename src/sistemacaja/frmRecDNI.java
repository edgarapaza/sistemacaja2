
package sistemacaja;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;
        


public class frmRecDNI extends javax.swing.JFrame {
    
    private int solic, esc;
    private String costo;
    public conexion con = new conexion();
    

    public frmRecDNI() {  //Constructor
        initComponents();
        
        try{
                con.conectar();
                ResultSet res=con.consulta("SELECT MAX(codSol) FROM solicitudes");
                res.next();
                solic=Integer.parseInt(res.getString(1));
                res=con.consulta("SELECT MAX(idSol) FROM escpublicas");
                res.next();
                esc=Integer.parseInt(res.getString(1));
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "error coneccion principal");
            }
    }
    
    public double HallarTotal(int cantidad, double precio)
    {
        Double total = cantidad * precio;
        return total;
    }
    
    public void SumaTotal()
    {
        double a = Double.parseDouble(this.txtTotalBusqueda.getText());
        double b = Double.parseDouble(this.txtTotalCalificacion.getText());
        double c = Double.parseDouble(this.txtTotalTestimonio.getText());
        double d = Double.parseDouble(this.txtTotalCopiaSimple.getText());
        double e = Double.parseDouble(this.txtTotalCopiaCertificada.getText());
        double f = Double.parseDouble(this.txtTotalCCPartidas.getText());
        double g = Double.parseDouble(this.txtTotalConstancia.getText());
        double h = Double.parseDouble(this.txtTotalExhibicion.getText());
        double i = Double.parseDouble(this.txtTotalFotocopias.getText());
        double j = Double.parseDouble(this.txtTotalTramiteAdministrativo.getText());
        double k = Double.parseDouble(this.txtTotalRegularizacionEscritura.getText());
        double l = Double.parseDouble(this.txtTotalTramiteRegistrosPublicos.getText());
        double m = Double.parseDouble(this.txtTotalAnotacionMarginal.getText());
        double n = Double.parseDouble(this.txtTotalPeritaje.getText());
        double o = Double.parseDouble(this.txtTotalOtros.getText());
        
        double suma = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o;
        float rpta = (float) (Math.rint(suma*10)/10);
        this.txtTotal.setText(rpta+"");
    }

  public void Decimal(){
      
          BigDecimal n = new BigDecimal("1");
          BigDecimal BIGDEC_3 = new BigDecimal("3");
          try{
              System.out.println(n.divide(BIGDEC_3));
              
          }catch (Exception ex) {
              System.err.println(ex.getClass().getName() + " : " + ex.getMessage());
          }
          MathContext mc = new MathContext(10, RoundingMode.HALF_UP);
          System.out.println(n.divide(BIGDEC_3, mc));
  }
  
  
    public void RestaFinal()
          {
              
              double z = Double.parseDouble(this.txtEfectivo.getText());
              double y = Double.parseDouble(this.txtTotal.getText());
              double resta = z-y;
              float rpta = (float) (Math.rint(resta*10)/10);
              this.lbCambia.setText(rpta+"");
            
          }   
    public void Mensaje()
    {
        System.out.println("Hola Daniel");
    }
    
    public void desactiva(){
           
            
            this.btnBuscarSolicitud.setEnabled(false);
        }
    public void activa(){
           
           
            this.btnBuscarSolicitud.setEnabled(true);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chkBusqueda = new javax.swing.JCheckBox();
        chkCalificacion = new javax.swing.JCheckBox();
        chkTestimonio = new javax.swing.JCheckBox();
        chkCopiaSimple = new javax.swing.JCheckBox();
        chkCopiaCertificada = new javax.swing.JCheckBox();
        chkCCPartidas = new javax.swing.JCheckBox();
        chkConstancia = new javax.swing.JCheckBox();
        chkExhibicion = new javax.swing.JCheckBox();
        chkFotocopias = new javax.swing.JCheckBox();
        chkTramiteAdministrativo = new javax.swing.JCheckBox();
        chkRegularizacionEscritura = new javax.swing.JCheckBox();
        chkTramiteRegistrosPublicos = new javax.swing.JCheckBox();
        chkAnotacionMarginal = new javax.swing.JCheckBox();
        chkOtros = new javax.swing.JCheckBox();
        txtOtros = new javax.swing.JTextField();
        txtCantidadCalificacion = new javax.swing.JTextField();
        txtCantidadBusqueda = new javax.swing.JTextField();
        txtCantidadTestimonio = new javax.swing.JTextField();
        txtCantidadCopiaSimple = new javax.swing.JTextField();
        txtPrecioUnitarioBusqueda = new javax.swing.JTextField();
        txtTotalBusqueda = new javax.swing.JTextField();
        txtCantidadCopiaCertificada = new javax.swing.JTextField();
        txtCantidadCCPartidas = new javax.swing.JTextField();
        txtCantidadConstancia = new javax.swing.JTextField();
        txtCantidadExhibicion = new javax.swing.JTextField();
        txtCantidadFotocopias = new javax.swing.JTextField();
        txtCantidadTramiteAdministrativo = new javax.swing.JTextField();
        txtCantidadRegularizacionEscritura = new javax.swing.JTextField();
        txtCantidadTramiteRegistrosPublicos = new javax.swing.JTextField();
        txtCantidadAnotacionMarginal = new javax.swing.JTextField();
        txtCantidadPeritaje = new javax.swing.JTextField();
        txtPrecioUnitarioCalificacion = new javax.swing.JTextField();
        txtPrecioUnitarioTestimonio = new javax.swing.JTextField();
        txtPrecioUnitarioCopiaSimple = new javax.swing.JTextField();
        txtPrecioUnitarioCopiaCertificada = new javax.swing.JTextField();
        txtPrecioUnitarioCCPartidas = new javax.swing.JTextField();
        txtPrecioUnitarioConstancia = new javax.swing.JTextField();
        txtPrecioUnitarioExhibicion = new javax.swing.JTextField();
        txtPrecioUnitarioFotocopias = new javax.swing.JTextField();
        txtPrecioUnitarioTramiteAdministrativo = new javax.swing.JTextField();
        txtPrecioUnitarioRegularizacionEscritura = new javax.swing.JTextField();
        txtPrecioUnitarioTramiteRegistrosPublicos = new javax.swing.JTextField();
        txtPrecioUnitarioAnotacionMarginal = new javax.swing.JTextField();
        txtPrecioUnitarioPeritaje = new javax.swing.JTextField();
        txtTotalCalificacion = new javax.swing.JTextField();
        txtTotalTestimonio = new javax.swing.JTextField();
        txtTotalCopiaSimple = new javax.swing.JTextField();
        txtTotalCopiaCertificada = new javax.swing.JTextField();
        txtTotalCCPartidas = new javax.swing.JTextField();
        txtTotalConstancia = new javax.swing.JTextField();
        txtTotalExhibicion = new javax.swing.JTextField();
        txtTotalFotocopias = new javax.swing.JTextField();
        txtTotalTramiteAdministrativo = new javax.swing.JTextField();
        txtTotalRegularizacionEscritura = new javax.swing.JTextField();
        txtTotalTramiteRegistrosPublicos = new javax.swing.JTextField();
        txtTotalAnotacionMarginal = new javax.swing.JTextField();
        txtTotalPeritaje = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnBuscarSolicitud = new javax.swing.JButton();
        lbCambia = new javax.swing.JLabel();
        chkPeritaje = new javax.swing.JCheckBox();
        txtCantidadOtros = new javax.swing.JTextField();
        txtPrecioUnitarioOtros = new javax.swing.JTextField();
        txtTotalOtros = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNunDNI = new javax.swing.JTextField();
        lblcodUsu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Recibi de ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(101, 67, 22));
        btnNuevo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 51));
        btnNuevo.setText("NUEVO");
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 42, 120, 30));

        jLabel3.setBackground(new java.awt.Color(51, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 11, 120, 30));

        txtNombreUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 287, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ACT.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("POR LO SIGUIENTE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 256, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("CANT.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("P. UNIT.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TOTAL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 79, 20));

        chkBusqueda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkBusqueda.setText("BUSQUEDA");
        chkBusqueda.setIconTextGap(30);
        chkBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(chkBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 132, 306, -1));

        chkCalificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkCalificacion.setText("CALIFICACIÓN");
        chkCalificacion.setIconTextGap(30);
        chkCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCalificacionActionPerformed(evt);
            }
        });
        getContentPane().add(chkCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 158, 280, -1));

        chkTestimonio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkTestimonio.setText("TESTIMONIO");
        chkTestimonio.setIconTextGap(30);
        chkTestimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTestimonioActionPerformed(evt);
            }
        });
        getContentPane().add(chkTestimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 184, -1, -1));

        chkCopiaSimple.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkCopiaSimple.setText("COPIA(S) SIMPLE(S)");
        chkCopiaSimple.setIconTextGap(30);
        chkCopiaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCopiaSimpleActionPerformed(evt);
            }
        });
        getContentPane().add(chkCopiaSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        chkCopiaCertificada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkCopiaCertificada.setText("COPIA(S) CERTIFICADA(S)");
        chkCopiaCertificada.setIconTextGap(30);
        chkCopiaCertificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCopiaCertificadaActionPerformed(evt);
            }
        });
        getContentPane().add(chkCopiaCertificada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 236, -1, -1));

        chkCCPartidas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkCCPartidas.setText("C. C. PARTIDAS");
        chkCCPartidas.setIconTextGap(30);
        chkCCPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCCPartidasActionPerformed(evt);
            }
        });
        getContentPane().add(chkCCPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 262, -1, -1));

        chkConstancia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkConstancia.setText("CONSTANCIA");
        chkConstancia.setIconTextGap(30);
        chkConstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConstanciaActionPerformed(evt);
            }
        });
        getContentPane().add(chkConstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 288, -1, -1));

        chkExhibicion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkExhibicion.setText("EXHIBICIÓN");
        chkExhibicion.setIconTextGap(30);
        chkExhibicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExhibicionActionPerformed(evt);
            }
        });
        getContentPane().add(chkExhibicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 314, -1, -1));

        chkFotocopias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkFotocopias.setText("FOTOCOPIAS");
        chkFotocopias.setIconTextGap(30);
        chkFotocopias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFotocopiasActionPerformed(evt);
            }
        });
        getContentPane().add(chkFotocopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        chkTramiteAdministrativo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkTramiteAdministrativo.setText("TRÁMITE ADMINISTRATIVO");
        chkTramiteAdministrativo.setIconTextGap(30);
        chkTramiteAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTramiteAdministrativoActionPerformed(evt);
            }
        });
        getContentPane().add(chkTramiteAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 366, -1, -1));

        chkRegularizacionEscritura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkRegularizacionEscritura.setText("REGULARIZACIÓN DE ESCRITURA");
        chkRegularizacionEscritura.setIconTextGap(30);
        chkRegularizacionEscritura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRegularizacionEscrituraActionPerformed(evt);
            }
        });
        getContentPane().add(chkRegularizacionEscritura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 392, -1, -1));

        chkTramiteRegistrosPublicos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkTramiteRegistrosPublicos.setText("TRÁMITE EN REGISTROS PÚBLICOS");
        chkTramiteRegistrosPublicos.setIconTextGap(30);
        chkTramiteRegistrosPublicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTramiteRegistrosPublicosActionPerformed(evt);
            }
        });
        getContentPane().add(chkTramiteRegistrosPublicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 418, -1, -1));

        chkAnotacionMarginal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkAnotacionMarginal.setText("ANOTACION MARGINAL");
        chkAnotacionMarginal.setIconTextGap(30);
        chkAnotacionMarginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnotacionMarginalActionPerformed(evt);
            }
        });
        getContentPane().add(chkAnotacionMarginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 444, -1, -1));

        chkOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOtrosActionPerformed(evt);
            }
        });
        getContentPane().add(chkOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 496, -1, -1));

        txtOtros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtrosActionPerformed(evt);
            }
        });
        getContentPane().add(txtOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 494, 252, -1));

        txtCantidadCalificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadCalificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadCalificacionKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 156, 30, -1));

        txtCantidadBusqueda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadBusquedaActionPerformed(evt);
            }
        });
        txtCantidadBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadBusquedaKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 30, -1));

        txtCantidadTestimonio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadTestimonio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadTestimonioKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadTestimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 182, 30, -1));

        txtCantidadCopiaSimple.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadCopiaSimple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadCopiaSimpleKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadCopiaSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 208, 30, -1));

        txtPrecioUnitarioBusqueda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 59, -1));

        txtTotalBusqueda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalBusqueda.setText("0");
        getContentPane().add(txtTotalBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 60, -1));

        txtCantidadCopiaCertificada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadCopiaCertificada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadCopiaCertificadaKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadCopiaCertificada, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 234, 30, -1));

        txtCantidadCCPartidas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadCCPartidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadCCPartidasKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadCCPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 30, -1));

        txtCantidadConstancia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadConstancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadConstanciaKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadConstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 286, 30, -1));

        txtCantidadExhibicion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadExhibicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadExhibicionKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadExhibicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 312, 30, -1));

        txtCantidadFotocopias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadFotocopias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadFotocopiasKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadFotocopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 338, 30, -1));

        txtCantidadTramiteAdministrativo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadTramiteAdministrativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadTramiteAdministrativoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadTramiteAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 364, 30, -1));

        txtCantidadRegularizacionEscritura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadRegularizacionEscritura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadRegularizacionEscrituraActionPerformed(evt);
            }
        });
        txtCantidadRegularizacionEscritura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadRegularizacionEscrituraKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadRegularizacionEscritura, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 30, -1));

        txtCantidadTramiteRegistrosPublicos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadTramiteRegistrosPublicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadTramiteRegistrosPublicosKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadTramiteRegistrosPublicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 416, 30, -1));

        txtCantidadAnotacionMarginal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadAnotacionMarginal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadAnotacionMarginalKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadAnotacionMarginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 442, 30, -1));

        txtCantidadPeritaje.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadPeritaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadPeritajeKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadPeritaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 468, 30, -1));

        txtPrecioUnitarioCalificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 156, 59, -1));

        txtPrecioUnitarioTestimonio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioTestimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 182, 59, -1));

        txtPrecioUnitarioCopiaSimple.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioCopiaSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 208, 59, -1));

        txtPrecioUnitarioCopiaCertificada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioCopiaCertificada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 234, 59, -1));

        txtPrecioUnitarioCCPartidas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioCCPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 59, -1));

        txtPrecioUnitarioConstancia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioConstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 286, 59, -1));

        txtPrecioUnitarioExhibicion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioExhibicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 312, 59, -1));

        txtPrecioUnitarioFotocopias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioFotocopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 338, 59, -1));

        txtPrecioUnitarioTramiteAdministrativo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioTramiteAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 364, 59, -1));

        txtPrecioUnitarioRegularizacionEscritura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioRegularizacionEscritura, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 59, -1));

        txtPrecioUnitarioTramiteRegistrosPublicos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioTramiteRegistrosPublicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 416, 59, -1));

        txtPrecioUnitarioAnotacionMarginal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPrecioUnitarioAnotacionMarginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 442, 59, -1));

        txtPrecioUnitarioPeritaje.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPrecioUnitarioPeritaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioUnitarioPeritajeKeyPressed(evt);
            }
        });
        getContentPane().add(txtPrecioUnitarioPeritaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 468, 59, -1));

        txtTotalCalificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalCalificacion.setText("0");
        getContentPane().add(txtTotalCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 156, 60, -1));

        txtTotalTestimonio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalTestimonio.setText("0");
        getContentPane().add(txtTotalTestimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 182, 60, -1));

        txtTotalCopiaSimple.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalCopiaSimple.setText("0");
        getContentPane().add(txtTotalCopiaSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 208, 60, -1));

        txtTotalCopiaCertificada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalCopiaCertificada.setText("0");
        txtTotalCopiaCertificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCopiaCertificadaActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalCopiaCertificada, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 234, 60, -1));

        txtTotalCCPartidas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalCCPartidas.setText("0");
        getContentPane().add(txtTotalCCPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 60, -1));

        txtTotalConstancia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalConstancia.setText("0");
        getContentPane().add(txtTotalConstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 286, 60, -1));

        txtTotalExhibicion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalExhibicion.setText("0");
        getContentPane().add(txtTotalExhibicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 312, 60, -1));

        txtTotalFotocopias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalFotocopias.setText("0");
        getContentPane().add(txtTotalFotocopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 338, 60, -1));

        txtTotalTramiteAdministrativo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalTramiteAdministrativo.setText("0");
        getContentPane().add(txtTotalTramiteAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 364, 60, -1));

        txtTotalRegularizacionEscritura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalRegularizacionEscritura.setText("0");
        getContentPane().add(txtTotalRegularizacionEscritura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 60, -1));

        txtTotalTramiteRegistrosPublicos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalTramiteRegistrosPublicos.setText("0");
        getContentPane().add(txtTotalTramiteRegistrosPublicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 416, 60, -1));

        txtTotalAnotacionMarginal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalAnotacionMarginal.setText("0");
        getContentPane().add(txtTotalAnotacionMarginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 442, 60, -1));

        txtTotalPeritaje.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalPeritaje.setText("0");
        getContentPane().add(txtTotalPeritaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 468, 60, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DINERO EN \nEFECTIVO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 180, 40));

        txtEfectivo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEfectivoActionPerformed(evt);
            }
        });
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyPressed(evt);
            }
        });
        getContentPane().add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 110, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("TOTAL S/. ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, -1, -1));

        txtTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 80, 30));

        btnBuscarSolicitud.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBuscarSolicitud.setText("BUSCAR SOLICITUD");
        btnBuscarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSolicitudActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 11, -1, -1));

        lbCambia.setBackground(new java.awt.Color(57, 9, 8));
        lbCambia.setFont(new java.awt.Font("Arial Black", 0, 60)); // NOI18N
        lbCambia.setForeground(new java.awt.Color(0, 57, 85));
        getContentPane().add(lbCambia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 270, 70));

        chkPeritaje.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkPeritaje.setText("PERITAJE");
        chkPeritaje.setIconTextGap(30);
        chkPeritaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPeritajeActionPerformed(evt);
            }
        });
        getContentPane().add(chkPeritaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        txtCantidadOtros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidadOtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadOtrosKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 494, 30, -1));

        txtPrecioUnitarioOtros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPrecioUnitarioOtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioUnitarioOtrosKeyPressed(evt);
            }
        });
        getContentPane().add(txtPrecioUnitarioOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 494, 59, -1));

        txtTotalOtros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalOtros.setText("0");
        getContentPane().add(txtTotalOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 494, 60, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("CAMBIO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("IMPRIMIR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, -1, -1));

        txtNunDNI.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNunDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNunDNIActionPerformed(evt);
            }
        });
        txtNunDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNunDNIKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNunDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNunDNIKeyTyped(evt);
            }
        });
        getContentPane().add(txtNunDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, -1));
        getContentPane().add(lblcodUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 50, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("DNI:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSolicitudActionPerformed
        String codigoUsuario, nombre ="";
        
        
        
        int numero = txtNunDNI.getText().length();
        String dni2 ="";
        if (numero <8){
            JOptionPane.showMessageDialog(rootPane, "Numero de Digitos de DNI Menor que 8 Numeros");
            this.txtNunDNI.requestFocus();
        }else{
            int dni=Integer.parseInt(txtNunDNI.getText());
            try{
                con.conectar();
                ResultSet rs=con.consulta("SELECT CONCAT(nombre,' ',apePat,' ',apeMat) AS nombre, codUsu FROM usuarios WHERE numDoc="+dni+" LIMIT 0,1;");
                rs.next();
                txtNombreUsuario.setText(rs.getString("nombre"));
                lblcodUsu.setText(rs.getString("codUsu"));
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Usuario no encontrado","Administrador de Sistema",JOptionPane.INFORMATION_MESSAGE);
                dni2 = this.txtNunDNI.getText();
                dialogNuevoUsuario p=new dialogNuevoUsuario(null,false,dni2);
                p.setVisible(true);
            }          
           
        }
    }//GEN-LAST:event_btnBuscarSolicitudActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void chkBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBusquedaActionPerformed
     if(this.chkBusqueda.isSelected())
        {
            
            this.chkBusqueda.setSelected(true);
            this.txtCantidadBusqueda.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 1;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioBusqueda.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadBusqueda.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioBusqueda.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalBusqueda.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
            
            
            this.txtCantidadBusqueda.setText("");
            this.txtPrecioUnitarioBusqueda.setText("");
            this.txtTotalBusqueda.setText(0+"");
            this.SumaTotal();
            
            
        }
        
        
       
    }//GEN-LAST:event_chkBusquedaActionPerformed

    private void txtCantidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadBusquedaActionPerformed

    }//GEN-LAST:event_txtCantidadBusquedaActionPerformed

    private void txtCantidadBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBusquedaKeyPressed
             int cantidad = Integer.parseInt(this.txtCantidadBusqueda.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioBusqueda.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            this.txtTotalBusqueda.setText(total+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadBusquedaKeyPressed

    private void chkCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCalificacionActionPerformed
        
        if(this.chkCalificacion.isSelected())
        {
            
            this.chkCalificacion.setSelected(true);
            this.txtCantidadCalificacion.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 2;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioCalificacion.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadCalificacion.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioCalificacion.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalCalificacion.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
            
            
            this.txtCantidadCalificacion.setText("");
            this.txtPrecioUnitarioCalificacion.setText("");
            this.txtTotalCalificacion.setText(0+"");
            this.SumaTotal();
            
            
        }
    }//GEN-LAST:event_chkCalificacionActionPerformed

    private void txtTotalCopiaCertificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCopiaCertificadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCopiaCertificadaActionPerformed

    private void txtCantidadCalificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCalificacionKeyPressed
        int cantidad = Integer.parseInt(this.txtCantidadCalificacion.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioCalificacion.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            this.txtTotalCalificacion.setText(total+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadCalificacionKeyPressed

    private void chkTestimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTestimonioActionPerformed
            if(this.chkTestimonio.isSelected())
        {
           
            this.chkTestimonio.setSelected(true);
            this.txtCantidadTestimonio.requestFocus();
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 3;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioTestimonio.setText(costo);
          
            this.SumaTotal();
        }
        else{
            
            
            this.txtCantidadTestimonio.setText("");
            this.txtPrecioUnitarioTestimonio.setText("");
            this.txtTotalTestimonio.setText(0+"");
            this.SumaTotal();
                       
        }
    }//GEN-LAST:event_chkTestimonioActionPerformed

    private void chkCopiaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCopiaSimpleActionPerformed
         
       if(this.chkCopiaSimple.isSelected())
        {
            
            this.chkCopiaSimple.setSelected(true);
            this.txtCantidadCopiaSimple.requestFocus();
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 4;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioCopiaSimple.setText(costo);
            
            
            this.SumaTotal();
        }
        else{
            
            
            this.txtCantidadCopiaSimple.setText("");
            this.txtPrecioUnitarioCopiaSimple.setText("");
            this.txtTotalCopiaSimple.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkCopiaSimpleActionPerformed

    private void chkCopiaCertificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCopiaCertificadaActionPerformed
        
        if(this.chkCopiaCertificada.isSelected())
        {
            
            this.chkCopiaCertificada.setSelected(true);
            this.txtCantidadCopiaCertificada.requestFocus();
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 6;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioCopiaCertificada.setText(costo);
           
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadCopiaCertificada.setText("");
            this.txtPrecioUnitarioCopiaCertificada.setText("");
            this.txtTotalCopiaCertificada.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkCopiaCertificadaActionPerformed

    private void chkCCPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCCPartidasActionPerformed
        if(this.chkCCPartidas.isSelected())
        {
            
            this.chkCCPartidas.setSelected(true);
            this.txtCantidadCCPartidas.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 16;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioCCPartidas.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadCCPartidas.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioCCPartidas.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalCCPartidas.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadCCPartidas.setText("");
            this.txtPrecioUnitarioCCPartidas.setText("");
            this.txtTotalCCPartidas.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkCCPartidasActionPerformed

    private void chkConstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConstanciaActionPerformed
        if(this.chkConstancia.isSelected())
        {
            
            this.chkConstancia.setSelected(true);
            this.txtCantidadConstancia.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 7;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioConstancia.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadConstancia.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioConstancia.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalConstancia.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadConstancia.setText("");
            this.txtPrecioUnitarioConstancia.setText("");
            this.txtTotalConstancia.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkConstanciaActionPerformed

    private void chkExhibicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExhibicionActionPerformed
        if(this.chkExhibicion.isSelected())
        {
            
            this.chkExhibicion.setSelected(true);
            this.txtCantidadExhibicion.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 8;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioExhibicion.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadExhibicion.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioExhibicion.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalExhibicion.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadExhibicion.setText("");
            this.txtPrecioUnitarioExhibicion.setText("");
            this.txtTotalExhibicion.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkExhibicionActionPerformed

    private void chkFotocopiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFotocopiasActionPerformed
        if(this.chkFotocopias.isSelected())
        {
            
            this.chkFotocopias.setSelected(true);
            this.txtCantidadFotocopias.requestFocus();
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 9;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioFotocopias.setText(costo);
           
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadFotocopias.setText("");
            this.txtPrecioUnitarioFotocopias.setText("");
            this.txtTotalFotocopias.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkFotocopiasActionPerformed

    private void chkTramiteAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTramiteAdministrativoActionPerformed
        if(this.chkTramiteAdministrativo.isSelected())
        {
            
            this.chkTramiteAdministrativo.setSelected(true);
            this.txtCantidadTramiteAdministrativo.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 10;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioTramiteAdministrativo.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadTramiteAdministrativo.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioTramiteAdministrativo.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalTramiteAdministrativo.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadTramiteAdministrativo.setText("");
            this.txtPrecioUnitarioTramiteAdministrativo.setText("");
            this.txtTotalTramiteAdministrativo.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkTramiteAdministrativoActionPerformed

    private void chkRegularizacionEscrituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRegularizacionEscrituraActionPerformed
        if(this.chkRegularizacionEscritura.isSelected())
        {
            
            this.chkRegularizacionEscritura.setSelected(true);
            this.txtCantidadRegularizacionEscritura.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 11;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioRegularizacionEscritura.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadRegularizacionEscritura.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioRegularizacionEscritura.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalRegularizacionEscritura.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadRegularizacionEscritura.setText("");
            this.txtPrecioUnitarioRegularizacionEscritura.setText("");
            this.txtTotalRegularizacionEscritura.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkRegularizacionEscrituraActionPerformed

    private void txtCantidadRegularizacionEscrituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadRegularizacionEscrituraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadRegularizacionEscrituraActionPerformed

    private void chkTramiteRegistrosPublicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTramiteRegistrosPublicosActionPerformed
        if(this.chkTramiteRegistrosPublicos.isSelected())
        {
            
            this.chkTramiteRegistrosPublicos.setSelected(true);
            this.txtCantidadTramiteRegistrosPublicos.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 12;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioTramiteRegistrosPublicos.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadTramiteRegistrosPublicos.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioTramiteRegistrosPublicos.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalTramiteRegistrosPublicos.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadTramiteRegistrosPublicos.setText("");
            this.txtPrecioUnitarioTramiteRegistrosPublicos.setText("");
            this.txtTotalTramiteRegistrosPublicos.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkTramiteRegistrosPublicosActionPerformed

    private void chkAnotacionMarginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnotacionMarginalActionPerformed
        if(this.chkAnotacionMarginal.isSelected())
        {
            
            this.chkAnotacionMarginal.setSelected(true);
            this.txtCantidadAnotacionMarginal.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 13;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioAnotacionMarginal.setText(costo);
            int cantidad = Integer.parseInt(this.txtCantidadAnotacionMarginal.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioAnotacionMarginal.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalAnotacionMarginal.setText(rpta+"");
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadAnotacionMarginal.setText("");
            this.txtPrecioUnitarioAnotacionMarginal.setText("");
            this.txtTotalAnotacionMarginal.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkAnotacionMarginalActionPerformed

    private void txtCantidadTestimonioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadTestimonioKeyPressed
        int cantidad = Integer.parseInt(this.txtCantidadTestimonio.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioTestimonio.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            this.txtTotalTestimonio.setText(total+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadTestimonioKeyPressed

    private void txtCantidadCopiaSimpleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCopiaSimpleKeyPressed
         int cantidad = Integer.parseInt(this.txtCantidadCopiaSimple.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioCopiaSimple.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalCopiaSimple.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadCopiaSimpleKeyPressed

    private void txtCantidadCopiaCertificadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCopiaCertificadaKeyPressed
         int cantidad = Integer.parseInt(this.txtCantidadCopiaCertificada.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioCopiaCertificada.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalCopiaCertificada.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadCopiaCertificadaKeyPressed

    private void txtCantidadCCPartidasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCCPartidasKeyPressed
         int cantidad = Integer.parseInt(this.txtCantidadCCPartidas.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioCCPartidas.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalCCPartidas.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadCCPartidasKeyPressed

    private void txtCantidadConstanciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadConstanciaKeyPressed
         int cantidad = Integer.parseInt(this.txtCantidadConstancia.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioConstancia.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalConstancia.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadConstanciaKeyPressed

    private void txtCantidadExhibicionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadExhibicionKeyPressed
         int cantidad = Integer.parseInt(this.txtCantidadExhibicion.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioExhibicion.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalExhibicion.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadExhibicionKeyPressed

    private void txtCantidadFotocopiasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadFotocopiasKeyPressed
         int cantidad = Integer.parseInt(this.txtCantidadFotocopias.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioFotocopias.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalFotocopias.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadFotocopiasKeyPressed

    private void txtCantidadTramiteAdministrativoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadTramiteAdministrativoKeyPressed
            int cantidad = Integer.parseInt(this.txtCantidadTramiteAdministrativo.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioTramiteAdministrativo.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalTramiteAdministrativo.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadTramiteAdministrativoKeyPressed

    private void txtCantidadRegularizacionEscrituraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadRegularizacionEscrituraKeyPressed
        int cantidad = Integer.parseInt(this.txtCantidadRegularizacionEscritura.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioRegularizacionEscritura.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalRegularizacionEscritura.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadRegularizacionEscrituraKeyPressed

    private void txtCantidadTramiteRegistrosPublicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadTramiteRegistrosPublicosKeyPressed
        int cantidad = Integer.parseInt(this.txtCantidadTramiteRegistrosPublicos.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioTramiteRegistrosPublicos.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalTramiteRegistrosPublicos.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadTramiteRegistrosPublicosKeyPressed

    private void txtCantidadAnotacionMarginalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadAnotacionMarginalKeyPressed
        int cantidad = Integer.parseInt(this.txtCantidadAnotacionMarginal.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioAnotacionMarginal.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalAnotacionMarginal.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadAnotacionMarginalKeyPressed

    private void txtCantidadPeritajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadPeritajeKeyPressed
        int cantidad = Integer.parseInt(this.txtCantidadPeritaje.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioPeritaje.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalPeritaje.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtCantidadPeritajeKeyPressed

    private void chkOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOtrosActionPerformed
         if(this.chkOtros.isSelected())
        {
            this.txtOtros.requestFocus();
            this.chkOtros.setSelected(true);
            this.txtCantidadOtros.setText(0+"");
           
            this.txtPrecioUnitarioOtros.setText(0+"");
            
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadOtros.setText("");
            this.txtPrecioUnitarioOtros.setText("");
            this.txtTotalOtros.setText(0+"");
            this.SumaTotal();
        }
    }//GEN-LAST:event_chkOtrosActionPerformed

    private void txtCantidadOtrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadOtrosKeyPressed
       
    }//GEN-LAST:event_txtCantidadOtrosKeyPressed

    private void chkPeritajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPeritajeActionPerformed
         if(this.chkPeritaje.isSelected())
        {
            
            this.chkPeritaje.setSelected(true);
            this.txtCantidadPeritaje.setText(1+"");
            try{
                con.conectar();
                ResultSet res=con.consulta("SELECT costo FROM tupa WHERE codTupa = 5;");
                res.next();
                costo=res.getString(1);
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
            this.txtPrecioUnitarioPeritaje.setText(costo);
            
            
            this.SumaTotal();
        }
        else{
                        
            this.txtCantidadPeritaje.setText("");
            this.txtPrecioUnitarioPeritaje.setText("");
            this.txtTotalPeritaje.setText(0+"");
            this.SumaTotal();
        }      
    }//GEN-LAST:event_chkPeritajeActionPerformed

    private void txtPrecioUnitarioPeritajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioPeritajeKeyPressed

    }//GEN-LAST:event_txtPrecioUnitarioPeritajeKeyPressed

    private void txtPrecioUnitarioOtrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioOtrosKeyPressed
    int cantidad = Integer.parseInt(this.txtCantidadOtros.getText());
        double precio = Double.parseDouble(this.txtPrecioUnitarioOtros.getText());
            
            double total = this.HallarTotal(cantidad, precio);
            float rpta = (float) (Math.rint(total*100)/100);
            this.txtTotalOtros.setText(rpta+"");
            this.SumaTotal();
    }//GEN-LAST:event_txtPrecioUnitarioOtrosKeyPressed

    private void txtEfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyPressed
       
        this.RestaFinal();
            
    }//GEN-LAST:event_txtEfectivoKeyPressed

    private void txtOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtrosActionPerformed

    private void txtEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEfectivoActionPerformed

    private void txtNunDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNunDNIKeyTyped
        int n = (int)evt.getKeyChar();
        if(n>=48 && n<=57 || n==13 || n==127){

        }else{
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtNunDNIKeyTyped

    private void txtNunDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNunDNIKeyReleased
        if(txtNunDNI.getText().length()>7){
            btnBuscarSolicitud.doClick();
        }
    }//GEN-LAST:event_txtNunDNIKeyReleased

    private void txtNunDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNunDNIKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            btnBuscarSolicitud.doClick();
        }
    }//GEN-LAST:event_txtNunDNIKeyPressed

    private void txtNunDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNunDNIActionPerformed

    }//GEN-LAST:event_txtNunDNIActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frmMenu Retorno=new frmMenu();
        Retorno.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        *******************************************************************************************
        *  Esta parte sirve para guardar en la tabla Recibo, todos los campos requidos por la tabla
        *  pero tambien, se efectua una consulta para recuperar el ultimo dato de la tabla recibos
        *  con el fin de que ese valor se pueda repetir la cantidad de veces necesarias para que se 
        *  guarde en la tabla "detallerecibo".
        ********************************************************************************************
        */
        int last_cod =0;
        
        double total = Double.parseDouble(this.txtTotal.getText());
        int codPersonal =  1101;
        int codUsuario = Integer.parseInt(this.lblcodUsu.getText());
        try{
            con.conectar();
            //Conectarse a la Base de Datos y ejecutar los SQL
            con.insertar("INSERT INTO recibo (numRec, numSol, total,fecha,hora,anulado,codPer,codUsu) VALUES (null,0,"+total+",now(),now(),0,"+codPersonal+","+codUsuario+");");
            
            ResultSet res1=con.consulta("select numRec from recibo order by numRec desc limit 0,1;");
            res1.next();
            last_cod = Integer.parseInt(res1.getString(1));
            
            con.cierraConexion();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        /*
        ************************************************************************
        **    fin de la Priemra parte de la consulta
        ***********************************************************************
        */

        
        
        /*
        **********************************************************************
        *   Verificando la activacion de los chekc de cada uno e insertando
        *   los valores segun corresponda
        **********************************************************************
        */
        
        if (this.chkBusqueda.isSelected())
        {           
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkBusqueda.getText();
            double cantidad = Double.parseDouble(this.txtCantidadBusqueda.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioBusqueda.getText());
            double subtotal = Double.parseDouble(this.txtTotalBusqueda.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkCalificacion.isSelected())
        {
             // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkCalificacion.getText();
            double cantidad = Double.parseDouble(this.txtCantidadCalificacion.getText());
            double precio = Double.parseDouble(this.txtPrecioUnitarioCalificacion.getText());
            double subtotal = Double.parseDouble(this.txtTotalCalificacion.getText());
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkTestimonio.isSelected())
        {
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkTestimonio.getText();
            double cantidad = Double.parseDouble(this.txtCantidadTestimonio.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioTestimonio.getText());
            double subtotal = Double.parseDouble(this.txtTotalTestimonio.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkCopiaSimple.isSelected())
        {
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkCopiaSimple.getText();
            double cantidad = Double.parseDouble(this.txtCantidadCopiaSimple.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioCopiaSimple.getText());
            double subtotal = Double.parseDouble(this.txtTotalCopiaSimple.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkCopiaCertificada.isSelected())
        {
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkCopiaCertificada.getText();
            double cantidad = Double.parseDouble(this.txtCantidadCopiaCertificada.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioCopiaCertificada.getText());
            double subtotal = Double.parseDouble(this.txtTotalCopiaCertificada.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkCCPartidas.isSelected())
        {
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkCCPartidas.getText();
            double cantidad = Double.parseDouble(this.txtCantidadCCPartidas.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioCCPartidas.getText());
            double subtotal = Double.parseDouble(this.txtTotalCCPartidas.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkConstancia.isSelected())
        {
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkConstancia.getText();
            double cantidad = Double.parseDouble(this.txtCantidadConstancia.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioConstancia.getText());
            double subtotal = Double.parseDouble(this.txtTotalConstancia.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkExhibicion.isSelected())
        {
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkExhibicion.getText();
            double cantidad = Double.parseDouble(this.txtCantidadExhibicion.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioExhibicion.getText());
            double subtotal = Double.parseDouble(this.txtTotalExhibicion.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkFotocopias.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "Fotocopia");
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkFotocopias.getText();
            double cantidad = Double.parseDouble(this.txtCantidadFotocopias.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioFotocopias.getText());
            double subtotal = Double.parseDouble(this.txtTotalFotocopias.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkTramiteAdministrativo.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "Tramite Administrativo");
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkTramiteAdministrativo.getText();
            double cantidad = Double.parseDouble(this.txtCantidadTramiteAdministrativo.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioTramiteAdministrativo.getText());
            double subtotal = Double.parseDouble(this.txtTotalTramiteAdministrativo.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkRegularizacionEscritura.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "Regularizacion de Escrituras");
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkRegularizacionEscritura.getText();
            double cantidad = Double.parseDouble(this.txtCantidadRegularizacionEscritura.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioRegularizacionEscritura.getText());
            double subtotal = Double.parseDouble(this.txtTotalRegularizacionEscritura.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkTramiteRegistrosPublicos.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "Tramite ");
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkTramiteRegistrosPublicos.getText();
            double cantidad = Double.parseDouble(this.txtCantidadTramiteRegistrosPublicos.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioTramiteRegistrosPublicos.getText());
            double subtotal = Double.parseDouble(this.txtTotalTramiteRegistrosPublicos.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkAnotacionMarginal.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "activo");
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.chkAnotacionMarginal.getText();
            double cantidad = Double.parseDouble(this.txtCantidadAnotacionMarginal.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioAnotacionMarginal.getText());
            double subtotal = Double.parseDouble(this.txtTotalAnotacionMarginal.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
        if (this.chkOtros.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "activo");
            // Declarando variables y capturando valores de cada line en el recibo
            String concepto = this.txtOtros.getText();
            double cantidad = Double.parseDouble(this.txtCantidadOtros.getText());
            double precio   = Double.parseDouble(this.txtPrecioUnitarioOtros.getText());
            double subtotal = Double.parseDouble(this.txtTotalOtros.getText());
            
            /*
            *  Aqui se guarda la informacion en la Tabla DetalleRecibo
            */
            try{
                con.conectar();
                //Conectarse a la Base de Datos y ejecutar los SQL
                con.insertar("INSERT INTO recepcion.detallerecibo (codDetRec,numRecibo,concepto,cantidad,pUnitario,subtotal,fecha) VALUES (null,"+last_cod+",'"+concepto+"',"+cantidad+","+precio+","+subtotal+",now());");
                con.cierraConexion();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
            /*
            ****************************************************************
            *   FIN DEL SCRIPT
            ****************************************************************
            */
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmRecDNI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRecDNI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRecDNI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRecDNI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRecDNI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarSolicitud;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chkAnotacionMarginal;
    private javax.swing.JCheckBox chkBusqueda;
    private javax.swing.JCheckBox chkCCPartidas;
    private javax.swing.JCheckBox chkCalificacion;
    private javax.swing.JCheckBox chkConstancia;
    private javax.swing.JCheckBox chkCopiaCertificada;
    private javax.swing.JCheckBox chkCopiaSimple;
    private javax.swing.JCheckBox chkExhibicion;
    private javax.swing.JCheckBox chkFotocopias;
    private javax.swing.JCheckBox chkOtros;
    private javax.swing.JCheckBox chkPeritaje;
    private javax.swing.JCheckBox chkRegularizacionEscritura;
    private javax.swing.JCheckBox chkTestimonio;
    private javax.swing.JCheckBox chkTramiteAdministrativo;
    private javax.swing.JCheckBox chkTramiteRegistrosPublicos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCambia;
    private javax.swing.JLabel lblcodUsu;
    private javax.swing.JTextField txtCantidadAnotacionMarginal;
    private javax.swing.JTextField txtCantidadBusqueda;
    private javax.swing.JTextField txtCantidadCCPartidas;
    private javax.swing.JTextField txtCantidadCalificacion;
    private javax.swing.JTextField txtCantidadConstancia;
    private javax.swing.JTextField txtCantidadCopiaCertificada;
    private javax.swing.JTextField txtCantidadCopiaSimple;
    private javax.swing.JTextField txtCantidadExhibicion;
    private javax.swing.JTextField txtCantidadFotocopias;
    private javax.swing.JTextField txtCantidadOtros;
    private javax.swing.JTextField txtCantidadPeritaje;
    private javax.swing.JTextField txtCantidadRegularizacionEscritura;
    private javax.swing.JTextField txtCantidadTestimonio;
    private javax.swing.JTextField txtCantidadTramiteAdministrativo;
    private javax.swing.JTextField txtCantidadTramiteRegistrosPublicos;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNunDNI;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txtPrecioUnitarioAnotacionMarginal;
    private javax.swing.JTextField txtPrecioUnitarioBusqueda;
    private javax.swing.JTextField txtPrecioUnitarioCCPartidas;
    private javax.swing.JTextField txtPrecioUnitarioCalificacion;
    private javax.swing.JTextField txtPrecioUnitarioConstancia;
    private javax.swing.JTextField txtPrecioUnitarioCopiaCertificada;
    private javax.swing.JTextField txtPrecioUnitarioCopiaSimple;
    private javax.swing.JTextField txtPrecioUnitarioExhibicion;
    private javax.swing.JTextField txtPrecioUnitarioFotocopias;
    private javax.swing.JTextField txtPrecioUnitarioOtros;
    private javax.swing.JTextField txtPrecioUnitarioPeritaje;
    private javax.swing.JTextField txtPrecioUnitarioRegularizacionEscritura;
    private javax.swing.JTextField txtPrecioUnitarioTestimonio;
    private javax.swing.JTextField txtPrecioUnitarioTramiteAdministrativo;
    private javax.swing.JTextField txtPrecioUnitarioTramiteRegistrosPublicos;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalAnotacionMarginal;
    private javax.swing.JTextField txtTotalBusqueda;
    private javax.swing.JTextField txtTotalCCPartidas;
    private javax.swing.JTextField txtTotalCalificacion;
    private javax.swing.JTextField txtTotalConstancia;
    private javax.swing.JTextField txtTotalCopiaCertificada;
    private javax.swing.JTextField txtTotalCopiaSimple;
    private javax.swing.JTextField txtTotalExhibicion;
    private javax.swing.JTextField txtTotalFotocopias;
    private javax.swing.JTextField txtTotalOtros;
    private javax.swing.JTextField txtTotalPeritaje;
    private javax.swing.JTextField txtTotalRegularizacionEscritura;
    private javax.swing.JTextField txtTotalTestimonio;
    private javax.swing.JTextField txtTotalTramiteAdministrativo;
    private javax.swing.JTextField txtTotalTramiteRegistrosPublicos;
    // End of variables declaration//GEN-END:variables
}
