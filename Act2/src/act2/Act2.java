/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.MessageBox;

public class Act2 {
    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Ejemplo SWT");
        shell.setSize(300, 200);
        shell.setLayout(null);

        Combo combo = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);
        combo.setBounds(50, 40, 200, 25);
        combo.setItems(new String[]{"15", "16", "9"});
        combo.select(0);

        Button boton = new Button(shell, SWT.PUSH);
        boton.setText("Mostrar seleccionado");
        boton.setBounds(70, 90, 150, 30);

        boton.addListener(SWT.Selection, e -> {
            MessageBox msg = new MessageBox(shell, SWT.OK);
            msg.setMessage("Has seleccionado: " + combo.getText());
            msg.open();
        });

        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
    }
}

