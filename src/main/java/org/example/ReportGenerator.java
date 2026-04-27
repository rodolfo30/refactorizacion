package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {

    public void generateUserReport(User user) {
        // Obtenemos el contenido procesado
        String reportContent = buildReportContent(user);

        saveToFile(reportContent, "user_report.txt");

        printConfirmation();
    }

    private String buildReportContent(User user) {
        String fullName = user.getFirstName() + " " + user.getLastName();
        int age = user.getAge();

        return "User Report for: " + fullName + "\n"
                + "Age: " + age + "\n"
                + "Membership: " + (user.hasMembership() ? "Active" : "Inactive");
    }

    private void saveToFile(String content, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error al guardar el reporte: " + e.getMessage());
        }
    }

    private void printConfirmation() {
        System.out.println("Reporte generado y guardado.");
    }
}
