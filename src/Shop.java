import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Shop {
    private List<Notebook> notebooks = new ArrayList<>();

    public void addNotebook(Notebook notebook) { notebooks.add(notebook); }

    public List<Notebook> filterNotebooks(Map<String, Integer> filterMap) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            boolean matches = true;
            if(filterMap.containsKey("ram") && notebook.getRam() < filterMap.get("ram")) {
                matches = false;
            }
            if(filterMap.containsKey("hdd") && notebook.getHdd() < filterMap.get("hdd")) {
                matches = false;
            }
            if(filterMap.containsKey("cpuFrequency") && notebook.getCpuFrequency() < filterMap.get("cpuFrequency")) {
                matches = false;
            }
            if(matches) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
}