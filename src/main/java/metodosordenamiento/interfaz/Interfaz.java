package metodosordenamiento.interfaz;

import java.util.Random;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    int[] arreglo;
    int n;

    public Interfaz() {
        initComponents();
        switchMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Burbuja", "Selección", "Inserción", "Shell", "Merge Sort", "Quick Sort"}));
    }
    
            @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTam = new javax.swing.JTextField();
        btnCrearArreglo = new javax.swing.JButton();
        txtInfo = new javax.swing.JLabel();
        txtEl = new javax.swing.JTextField();
        txtIngresarEl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaArrOriginal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaArrMetodo = new javax.swing.JTextArea();
        switchMetodo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Metodos de Ordenamiento");

        jLabel2.setText("Tamaño");

        txtTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //txtTamActionPerformed(evt);
            }
        });

        btnCrearArreglo.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnCrearArreglo.setText("Crear");
        btnCrearArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArregloActionPerformed(evt);
            }
        });

        txtEl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //txtElActionPerformed(evt);
            }
        });

        txtIngresarEl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtIngresarEl.setText("Ingresar");
        txtIngresarEl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarElActionPerformed(evt);
            }
        });

        areaArrOriginal.setColumns(20);
        areaArrOriginal.setRows(5);
        jScrollPane1.setViewportView(areaArrOriginal);

        areaArrMetodo.setColumns(20);
        areaArrMetodo.setRows(5);
        jScrollPane2.setViewportView(areaArrMetodo);

        switchMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        switchMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchMetodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInfo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEl)
                                .addGap(38, 38, 38)
                                .addComponent(txtIngresarEl))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTam, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCrearArreglo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(switchMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearArreglo))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(switchMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIngresarEl))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>   


    private void switchMetodoActionPerformed(java.awt.event.ActionEvent evt) {
        int op = switchMetodo.getSelectedIndex();
        switch (op) {
            case 0:
                Burbuja();
                break;
            case 1:
                Seleccion();
                break;
            case 2:
                Insercion();
                break;
            case 3:
                Shell();
                break;
            case 4:
                MergeSort();
                break;
            case 5:
                QuickSort();
                break;
        }
    }

private void Burbuja() {
        int[] arr = arreglo;
        int n = arr.length;
        int intercambios = 0;
        int pasadas = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Realizar el intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambios++;
                }
                pasadas++;
            }
        }

        mostrarResultado("Burbuja", intercambios, pasadas);
    }

    private void Seleccion() {
        int[] arr = arreglo;
        int n = arr.length;
        int intercambios = 0;
        int pasadas = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    minIndex = j;
                }
                pasadas++;
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                intercambios++;
            }
        }

        mostrarResultado("Selección", intercambios, pasadas);
    }

    private void Insercion() {
        int[] arr = arreglo;
        int n = arr.length;
        int intercambios = 0;
        int pasadas = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            pasadas++;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                intercambios++;
            }
            arr[j + 1] = key;
        }

        mostrarResultado("Inserción", intercambios, pasadas);
    }

    private void Shell() {
        int[] arr = arreglo;
        int n = arr.length;
        int intercambios = 0;
        int pasadas = 0;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                pasadas++;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    intercambios++;
                }
                arr[j] = temp;
            }
        }

        mostrarResultado("Shell", intercambios, pasadas);
    }
    
private void MergeSort() {
        int[] arr = arreglo;
        int[] temp = new int[arr.length];
        int intercambios = 0;
        int pasadas = 0;
        MergeSortRecursive(0, arr.length - 1, temp, intercambios, pasadas);
        mostrarResultado("Merge Sort", intercambios, pasadas);
    }

    private void MergeSortRecursive(int l, int r, int[] temp, int intercambios, int pasadas) {
        if (l < r) {
            int m = l + (r - l) / 2;
            MergeSortRecursive(l, m, temp, intercambios, pasadas);
            MergeSortRecursive(m + 1, r, temp, intercambios, pasadas);
            Merge(l, m, r, temp, intercambios, pasadas);
        }
    }

    private void Merge(int l, int m, int r, int[] temp, int intercambios, int pasadas) {
        int[] arr = arreglo;
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + i + 1];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            pasadas++;
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
                intercambios++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private void QuickSort() {
        int[] arr = arreglo;
        int intercambios = 0;
        int pasadas = 0;
        QuickSortRecursive(0, arr.length - 1, intercambios, pasadas);
        mostrarResultado("Quick Sort", intercambios, pasadas);
    }

    private void QuickSortRecursive(int low, int high, int intercambios, int pasadas) {
        if (low < high) {
            int pi = Partition(low, high, intercambios, pasadas);
            QuickSortRecursive(low, pi - 1, intercambios, pasadas);
            QuickSortRecursive(pi + 1, high, intercambios, pasadas);
        }
    }

    private int Partition(int low, int high, int intercambios, int pasadas) {
        int[] arr = arreglo;
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            pasadas++;
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                intercambios++;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        intercambios++;

        return i + 1;
    }

    private void mostrarResultado(String metodo, int intercambios, int pasadas) {
        int[] arr = arreglo;
        areaArrMetodo.setText("Arreglo Ordenado (" + metodo + "):\n");
        for (int i = 0; i < arr.length; i++) {
            areaArrMetodo.append(arr[i] + ", ");
        }
        areaArrMetodo.append("\n");
        areaArrMetodo.append("Intercambios: " + intercambios + "\n");
        areaArrMetodo.append("Pasadas: " + pasadas + "\n");
    }
    private static int[] generarArregloAleatorio(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    private void btnCrearArregloActionPerformed(java.awt.event.ActionEvent evt) {
        // Ingresamos el tamaño del arreglo (n)
        try {
            n = Integer.parseInt(txtTam.getText());
            if (n <= 0) {
                JOptionPane.showMessageDialog(this, "El tamaño debe ser un número positivo.");
                return;
            }
            arreglo = new int[n];
            txtInfo.setText("Arreglo de tamaño " + n + " creado.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un tamaño válido.");
        }
    }

    private void txtIngresarElActionPerformed(java.awt.event.ActionEvent evt) {
        if (n <= 0) {
            JOptionPane.showMessageDialog(this, "Primero crea un arreglo.");
            return;
        }

        String[] elementos = txtEl.getText().split(",");
        if (elementos.length != n) {
            JOptionPane.showMessageDialog(this, "Ingresa " + n + " elementos separados por comas.");
            return;
        }

        for (int i = 0; i < n; i++) {
            try {
                int el = Integer.parseInt(elementos[i].trim());
                areaArrOriginal.append(el + ", ");
                arreglo[i] = el;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingresa elementos válidos.");
                return;
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    private javax.swing.JTextArea areaArrMetodo;
    private javax.swing.JTextArea areaArrOriginal;
    private javax.swing.JButton btnCrearArreglo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> switchMetodo;
    private javax.swing.JTextField txtEl;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JButton txtIngresarEl;
    private javax.swing.JTextField txtTam;
}