use threadpool::ThreadPool as GenericThreadPool;

pub struct ThreadPool {
    pool: GenericThreadPool,
}

impl ThreadPool {
    pub fn new(size: usize) -> Self {
        ThreadPool {
            pool: GenericThreadPool::new(size),
        }
    }

    pub fn execute<F>(&self, f: F)
    where
        F: FnOnce() + Send + 'static,
    {
        self.pool.execute(f);
    }
}
