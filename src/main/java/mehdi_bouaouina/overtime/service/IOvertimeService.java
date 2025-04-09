package mehdi_bouaouina.overtime.service;

import mehdi_bouaouina.overtime.dto.OvertimeResponseDto;
import mehdi_bouaouina.overtime.model.entity.Employee;
import mehdi_bouaouina.overtime.model.entity.Overtime;
import mehdi_bouaouina.overtime.model.entity.Price;

import java.util.Date;
import java.util.List;

public interface IOvertimeService {
    public List<Employee> findAllEmployees();
    public Employee addEmployee(Employee employee);

    public List<Overtime> findAllOvertimes();
    public Overtime addOvertime(Overtime overtime);

    public List<OvertimeResponseDto> findOvertimePerEmployeeByDate(Date startDate , Date endDate);


    public List<Price> findAllPrices();


}
