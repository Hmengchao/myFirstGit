package org.mapper;

import org.entity.Cargo;

import java.util.List;

    public interface CargoMapper {
        public Cargo QueryCargoById(String Cargo_ID);
        public int DeleteCargoById(String Cargo_ID);
        public int InsertCargo(Cargo cargo);
        public int updateCargoById(Cargo cargo);
    public List<Cargo> QueryAllCargo();
}
