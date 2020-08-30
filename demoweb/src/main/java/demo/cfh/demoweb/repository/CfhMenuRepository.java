package demo.cfh.demoweb.repository;


import demo.cfh.demoweb.entity.CfhMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CfhMenuRepository extends JpaRepository<CfhMenuEntity, Integer> {
}
