-- DELIMITER //
-- CREATE TRIGGER verificar_cantidad_inventario
-- BEFORE INSERT ON venta
-- FOR EACH ROW
-- BEGIN
--     DECLARE cantidad_disponible INT;
--     -- Obtener la cantidad disponible en el inventario
--     SELECT inv.cantidad INTO cantidad_disponible FROM inventario inv
--     WHERE inv.id_producto_fk = NEW.id_producto_fk;

--     -- Verificar si la cantidad disponible es suficiente
--     IF cantidad_disponible IS NULL OR cantidad_disponible < NEW.cantidad THEN
--         SIGNAL SQLSTATE '45000'
--         SET MESSAGE_TEXT = 'No hay suficiente cantidad en el inventario para esta venta';
--     END IF;
-- END;
-- //
-- DELIMITER ;


-- DELIMITER //
-- CREATE TRIGGER actualizar_nueva_cantidad_producto
-- AFTER INSERT ON venta
-- FOR EACH ROW
-- BEGIN
--     DECLARE producto_no_encontrado CONDITION FOR SQLSTATE '45000';
--     -- Intentar actualizar la cantidad
--     START TRANSACTION;
--     UPDATE inventario SET cantidad = cantidad - NEW.cantidad WHERE inventario.id_producto_fk = NEW.id_producto_fk;
--     -- Comprobar si se actualizaron filas
--     IF ROW_COUNT() = 0 THEN
--         ROLLBACK;
--         SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Producto no encontrado';
--     ELSE
--         -- Actualización exitosa, confirmar la transacción
--         COMMIT;
--     END IF;
-- END;
-- //
-- DELIMITER ;

INSERT INTO tipo_producto (nombre) VALUES 
('Zapatillas'),
('Camisetas'),
('Pantalones');

INSERT INTO color_producto (nombre) VALUES 
('Rojo'),
('Azul'),
('Negro');

INSERT INTO talla_producto (nombre) VALUES 
('S'),
('M'),
('L');

INSERT INTO forma_pago (nombre) VALUES 
('Tarjeta de crédito'),
('Transferencia bancaria'),
('PayPal');

INSERT INTO usuario (nombre, correo, clave, tipo_usuario) VALUES 
('Juan Pérez', 'juan@example.com', 'clave123', 'usuario'),
('María López', 'maria@example.com', 'clave321', 'usuario'),
('Admin', 'admin@example.com', 'admin123', 'admin');

INSERT INTO producto (nombre, precio, id_tipo_fk, id_color_fk, id_talla_fk) VALUES 
('Zapatillas Rojas', 79.99, 1, 1, 1),
('Camiseta Azul', 29.99, 2, 2, 2),
('Pantalones Negros', 49.99, 3, 3, 3);

INSERT INTO inventario (cantidad, id_producto_fk) VALUES 
(50, 1),
(30, 2),
(20, 3);

INSERT INTO venta (fecha, cantidad, total, id_producto_fk, id_cliente_fk, id_forma_pago_fk) VALUES 
('2024-04-24', 1, 79.99, 1, 1, 1),
('2024-04-25', 2, 59.98, 2, 2, 2),
('2024-04-26', 1, 49.99, 3, 1, 3);