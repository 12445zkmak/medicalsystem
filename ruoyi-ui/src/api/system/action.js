import request from '@/utils/request'

// 查询医生看病结果列表
export function listAction(query) {
  return request({
    url: '/system/action/list',
    method: 'get',
    params: query
  })
}

// 查询医生看病结果详细
export function getAction(id) {
  return request({
    url: '/system/action/' + id,
    method: 'get'
  })
}

// 新增医生看病结果

export function addAction(data) {
  return request({
    url: '/system/action',
    method: 'post',
    data: data
  })
}

// 修改医生看病结果

export function updateAction(data) {
  return request({
    url: '/system/action',
    method: 'put',
    data: data
  })
}

// 删除医生看病结果

export function delAction(id) {
  return request({
    url: '/system/action/' + id,
    method: 'delete'
  })
}
