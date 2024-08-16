class TaskManager {
    private String[] tasks = new String[10];
    private int count = 0;

    public void addTask(String task) {
        if (count < tasks.length) {
            tasks[count] = task;
            count++;
            System.out.println("Tarea añadida: " + task);
        } else {
            System.out.println("No hay espacio para más tareas.");
        }
    }

    public void removeTask(String task) {
        for (int i = 0; i < count; i++) {
            if (task.equals(tasks[i])) {
                for (int j = i; j < count - 1; j++) {
                    tasks[j] = tasks[j + 1];
                }
                tasks[count - 1] = null;
                count--;
                System.out.println("Tarea eliminada: " + task);
                return;
            }
        }
        System.out.println("Tarea no encontrada: " + task);
    }

    public void showTasks() {
        System.out.println("Tareas pendientes:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
    }
}